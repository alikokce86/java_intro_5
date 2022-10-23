package string_methods;

public class _04_equalsIgnoreCase_Method {
    public static void main(String[] args) {

        /*
        discussion
        1.return type
        2. returns a boolean (true-false)
        3. non-static, it is not a string class
        4. it takes one string as an argument
        */

        System.out.println("hello".equals("Hello")); // false
        System.out.println("hello".equalsIgnoreCase("Hello")); // true
    }
}
