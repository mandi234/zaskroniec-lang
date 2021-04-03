package com.mandask;

public class LLVMGenerator {
    static String header_text = "";
    static String main_text = "";
    static int reg = 1;

    static void printf_i32(String id){
        main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void printf_double(String id){
        main_text += "%"+reg+" = load double, double* %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
        reg++;
    }

    static String generate() {
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
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
}