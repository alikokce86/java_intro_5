package string_methods;

public class _01_valueOf_Method {
    public static void main(String[] args) {

        /*
        Method Task: Convert given variable to a String
        -it is static - you can call it with class name
        -it is a return type, and it returns a String
        -It takes different arguments as it is a overloaded method and converts given args to a String
         */

        int i = 125;

        String num = String.valueOf(i); // num = 125

        System.out.println(i + 5); // 130
        System.out.println(num + 5); // 1255
    }
}
