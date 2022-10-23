package string_methods;

public class _05_toUppercase_toLowerCase_Methods {
    public static void main(String[] args) {


        String name = "John";

        System.out.println(name.toLowerCase()); // john
        System.out.println(name.toUpperCase()); // JOHN

        System.out.println("hello".toUpperCase()); // HELLO
        System.out.println("hello".toLowerCase()); // hello

        System.out.println("abc".toUpperCase().toLowerCase()); // abc

        System.out.println("ab".toUpperCase().concat("xY".toLowerCase()).toLowerCase()); // abxy

        //
    }
}
