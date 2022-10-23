package string_methods;

import utilities.ScannerHelper;

public class Exercise03_LenghtPractice {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter 2 strings
        And store answers of user in different Strings
        Finally, print the length of those Strings with proper messages

        Assume user entered "Java" and "C#"

        EXPECTED OUTPUT:
        The length of the first string = 4
        The length of the second string = 2
         */

        String s1 = ScannerHelper.getAString();
        String s2 = ScannerHelper.getAString();

        System.out.println(" The length of the first string = " + s1.length());
        System.out.println(" The length of the second string = " + s2.length());







    }
}
