package com.mandask;

import java.util.Stack;

public class LLVMGenerator {
    static String header_text = "";
    static String buffer = "";
    static String main_text = "";
    static int reg = 1;
    static int br = 0;
    static int whileReg = 0;
    static int mainReg = 1;

    static Stack<Integer> brStack = new Stack<>();
    static Stack<Integer> whlieRegStack = new Stack<>();


    static void load_i32(String id) {
        buffer += "%"+reg+" = load i32, i32* "+id+"\n";
        reg++;
    }

    static void load_double(String id) {
        buffer += "%"+reg+" = load double, double* "+id+"\n";
        reg++;
    }

    static void printf_i32(String id){
        load_i32(id);
        buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void printf_double(String id){
        load_double(id);
        buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
        reg++;
    }

    static void scanf_i32(String id){
        buffer += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %"+id+")\n";
        reg++;
    }

    static void scanf_double(String id){
        buffer += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i64 0, i64 0), double* %"+id+")\n";
        reg++;
    }


    static String generate() {
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [5 x i8] c\"%lf\\0A\\00\"\n";
        text += "@strsi = constant [3 x i8] c\"%d\\00\"\n";
        text += "@strsd = constant [4 x i8] c\"%lf\\00\"\n";
        text += header_text;
        text += "define i32 @main() nounwind{\n";
        text += main_text;
        text += "ret i32 0 }\n";
        return text;
    }

    public static void declare_i32(String id, Boolean global) {
        if (global) {
            header_text += "@"+id+" = global i32 0\n";
            return;
        }
        buffer += "%"+id+" = alloca i32\n";
    }

    public static void declare_double(String id, Boolean global) {
        if (global) {
            header_text += "@"+id+" = global double 0\n";
            return;
        }
        buffer += "%"+id+" = alloca double\n";
    }

    public static void assign_i32(String id, String value) {
        buffer += "store i32 "+value+", i32* "+id+"\n";
    }

    public static void assign_double(String id, String value) {
        buffer += "store double "+value+", double* "+id+"\n";
    }

    public static void add_i32(String val1, String val2){
        buffer += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
        reg++;
    }

    public static void add_double(String val1, String val2){
        buffer += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
        reg++;
    }

    public static void mult_i32(String val1, String val2){
        buffer += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
        reg++;
    }

    public static void mult_double(String val1, String val2){
        buffer += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
        reg++;
    }

    public static void div_i32(String val1, String val2) {
        buffer += "%"+reg+" = sdiv i32 "+val2+", "+val1+"\n";
        reg++;
    }

    public static void div_double(String val1, String val2) {
        buffer += "%"+reg+" = fdiv double "+val2+", "+val1+"\n";
        reg++;
    }

    public static void sub_double(String val1, String val2) {
        buffer += "%"+reg+" = fsub double "+val2+", "+val1+"\n";
        reg++;
    }

    public static void sub_i32(String val1, String val2) {
        buffer += "%"+reg+" = sub i32 "+val2+", "+val1+"\n";
        reg++;
    }

    public static void mod_i32(String val1, String val2) {
        buffer += "%"+reg+" = srem i32 "+val2+", "+val1+"\n";
        reg++;
    }



    public static void ifEnd() {
        int b = brStack.pop();
        buffer += "br label %false"+b+"\n";
        buffer += "false"+b+":\n";
    }

    public static void icmp(String leftExp, String rightExp, String operator) {
        buffer += "%"+reg+" = load i32, i32* %"+leftExp+"\n";
        reg++;
        buffer += "%"+reg+" = icmp "+operator+" i32 %"+(reg-1)+", "+rightExp+"\n";
        reg++;
        br++;
        buffer += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
        buffer += "true"+br+":\n";
        brStack.push(br);
    }

    public static void whileStart() {
        whileReg++;
        buffer += "br label %while"+whileReg+"\n";
        buffer += "while"+whileReg+":\n";
        whlieRegStack.push(whileReg);
    }

    public static void whileEnd() {
        int r = whlieRegStack.pop();
        buffer += "br label %while"+r+"\n";
        int b = brStack.pop();
        buffer += "false"+b+":\n";
    }

    public static void closeMain() {
        main_text += buffer;
    }

    public static void functionStart(String id) {
        main_text += buffer;
        mainReg = reg;
        buffer = "define i32 @"+id+"() nounwind {\n";
        reg = 1;
    }

    public static void functionEnd() {
        buffer += "ret i32 %"+(reg-1)+"\n";
        buffer += "}\n";
        header_text += buffer;
        buffer = "";
        reg = mainReg;
    }

    public static void callFunction(String id) {
        buffer += "%"+reg+" = call i32 @"+id+"()\n";
        reg++;
    }
}
