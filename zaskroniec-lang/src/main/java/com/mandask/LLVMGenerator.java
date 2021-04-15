package com.mandask;

public class LLVMGenerator {
    static String header_text = "";
    static String main_text = "";
    static int reg = 1;

    static void load_i32(String id) {
        main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
        reg++;
    }

    static void load_double(String id) {
        main_text += "%"+reg+" = load double, double* %"+id+"\n";
        reg++;
    }

    static void printf_i32(String id){
        load_i32(id);
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void printf_double(String id){
        load_double(id);
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
        reg++;
    }

    static void scanf_i32(String id){
        main_text += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %"+id+")\n";
        reg++;
    }

    static void scanf_double(String id){
        main_text += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i64 0, i64 0), double* %"+id+")\n";
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

    public static void declare_i32(String id) {
        main_text += "%"+id+" = alloca i32\n";
    }

    public static void assign_i32(String id, String value) {
        main_text += "store i32 "+value+", i32* %"+id+"\n";
    }

    public static void declare_double(String id) {
        main_text += "%"+id+" = alloca double\n";
    }

    public static void assign_double(String id, String value) {
        main_text += "store double "+value+", double* %"+id+"\n";
    }

    public static void add_i32(String val1, String val2){
        main_text += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
        reg++;
    }

    public static void add_double(String val1, String val2){
        main_text += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
        reg++;
    }

    public static void mult_i32(String val1, String val2){
        main_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
        reg++;
    }

    public static void mult_double(String val1, String val2){
        main_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
        reg++;
    }

    public static void div_i32(String val1, String val2) {
        main_text += "%"+reg+" = sdiv i32 "+val2+", "+val1+"\n";
        reg++;
    }

    public static void div_double(String val1, String val2) {
        main_text += "%"+reg+" = fdiv double "+val2+", "+val1+"\n";
        reg++;
    }

    public static void sub_double(String val1, String val2) {
        main_text += "%"+reg+" = fsub double "+val2+", "+val1+"\n";
        reg++;
    }

    public static void sub_i32(String val1, String val2) {
        main_text += "%"+reg+" = sub i32 "+val2+", "+val1+"\n";
        reg++;
    }

    public static void mod_i32(String val1, String val2) {
        main_text += "%"+reg+" = srem i32 "+val2+", "+val1+"\n";
        reg++;
    }

}
