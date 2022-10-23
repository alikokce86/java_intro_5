package projects;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Project03_Solution {
    public static void main(String[] args) {


        System.out.println("***** TASK 1 *****");

        /*
        -Assume that you are given below Strings
        String s1 = “24”, s2 = “5”;
        -Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
        The sum of 24 and 5 = 29
        The subtraction of 24 and 5 = 19
        The division of 24 and 5 = 4.8
        The multiplication of 24 and 5  = 120
        The remainder of 24 and 5 = 4
        */

        String s1 = "24", s2 = "5";

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (num1 + num2));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " = " + (num1 - num2));
        System.out.println("The division of " + s1 + " and " + s2 + " = " +  ((double) num1 / num2));
        System.out.println("The multiplication of " + s1 + " and " + s2 + " = " + (num1 * num2));
        System.out.println("The remainder of " + s1 + " and " + s2 + " = " + (num1 % num2));

        /*
        Write a program that generates a random number between 1 and 35 (1 to 35 are included)
        Find if the given number is Prime
        Prime Numbers - 2, 3, 5, 7, 11, 13, 17...
         */
        System.out.println("\n***** TASK 2 *****");
        int ranNum = 1 + (int)(Math.random() * 35);
        boolean isPrime = true;
        for (int i = 2; i <= ranNum / 2; i++) {
            if (ranNum % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println(ranNum + " is a prime number");
        else System.out.println(ranNum + " is not a prime number");


        // Your expected answer should match something like...
//        int random = (int)(Math.random() * 35 + 1);
//        System.out.println(random);
//        if (random == 1){
//            System.out.println(random + " IS NOT A PRIME NUMBER");
//        }
//        else if (random == 2 || random == 3 || random == 5 || random % 2 != 0 && random % 3 != 0 && random % 5 != 0){
//            System.out.println(random + " IS A PRIME NUMBER");
//        }
//        else {
//            System.out.println(random + " IS NOT A PRIME NUMBER");
//        }

        /*


        /*
        TASK-3
        -Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are
        included)
        -Find and print each number in an ascending order
        -Ascending order is ordering from lowest to greatest
        NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this
        task.
        Test data: Assume below numbers are generated
        Random number 1 = 43
        Random number 2 = 7
        Random number 3 = 30
        Expected result:
        Lowest number is = 7
        Middle number is = 30
        Greatest number is = 43
         */

        System.out.println("\nTASK3\n");

        int numb1 = (int)(Math.random() * 50) + 1;
        int numb2 = (int)(Math.random() * 50) + 1;
        int numb3 = (int)(Math.random() * 50) + 1;

        int max = Math.max(Math.max(numb1, numb2), numb3);
        int min = Math.min(Math.min(numb1, numb2), numb3);

        System.out.println("Lowest number is = " + min);
        if (numb1 != max && numb1 != min){
            System.out.println("Middle number is = " + numb1);
        }else if (numb2 != max && numb2 != min){
            System.out.println("Middle number is = " + numb2);
        }else{
            System.out.println("Middle number is = " + numb3);
        }
        System.out.println("Greatest number is = " + max);

        /*
        TASK-4 (Find if given char is lowercase or uppercase)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If the given char is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out if it is an uppercase or a lowercase letter.
        -If the letter is uppercase, then print “The letter is uppercase”, else print “The
        letter is lowercase”.
        NOTE: You need to use ASCII table and casting for this task
        Test data 1: Assume you are given 5
        char c = ‘5’;
        Expected result 1:
        Invalid character detected!!!
        Test data 2: Assume you are given a
        char c = ‘a’;
        Expected result 2:
        The letter is lowercase
        Test data 3: Assume you are given R
        char c = ‘R’;
         */
        System.out.println("\nTASK4\n");
        char c = '5';

        if (c >= 'a' && c <= 'z'){
            System.out.println("The letter is lowercase");
        }else if (c >= 'A' && c <= 'Z'){
            System.out.println("The letter is uppercase");
        }else{
            System.out.println("Invalid character detected!!!");
        }

        /*
        TASK-5 (Find if given char is vowel or consonant)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If it is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out whether it is a vowel or a consonant.
        -If the letter is vowel, then print “The letter is vowel”, else print “The letter is
        consonant”.
        -Vowel letters: a, e, I, o, u, A, E, I, O, U
        NOTE: You need to use ASCII table and casting for this example
        Test data 1: Assume you are given #
        char c = ‘#’;
        Expected result 1:
        Invalid character detected!!!
        Test data 2: Assume you are given E
        char c = ‘E’;
        Expected result 2:
        The letter is vowel
        Test data 3: Assume you are given R
        char c = ‘R’;
        Expected result 3:
        The letter is consonant
         */

//        if (c <= 64 || (c >= 91 && c <= 96) || c > 122){ // <-- special & number --> cInt >= 48 && cInt <= 57
//            System.out.println("Invalid character detected!!!");
//        } else {
//            switch (c) { //vowel
//                case 97: // a --> can put 97 or 'a'
//                case 101: // e
//                case 105: // i
//                case 111: // o
//                case 117: // u
//                case 65: // A
//                case 69: // E
//                case 73: // I
//                case 79: // O
//                case 85: // U
//                    System.out.println("The letter is vowel");
//                    break; // W/O break; the program will continue print out even after a match has been made
//                default: // consonant
//                    System.out.println("The letter is consonant");
//            }
//
//        }

        System.out.println("\nTASK5\n");

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            // EVERYTHING IN HERE IS LETTER


            switch (c){
                case 'a': // 97
                case 101: // e
                case 105: // i
                case 111: // o
                case 117: // u
                case 65: // A
                case 69: // E
                case 73: // I
                case 79: // O
                case 85: // U
                    System.out.println("The letter is vowel");
                    break;
                default:
                    System.out.println("The letter is consonant");
            }

        }else {
            System.out.println("Invalid character detected!!!");
        }


        //   boolean isLetterOrDigit = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');

        //  boolean isSpecial = !(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z') && !(c >= '0' && c <= '9');


        /*
        Task 6
        Assume you are given a single character. (It will be hard-coded)
        -First, check if the given char is a special character but not a digit or not a letter.
        -If it is not a special character, then print “Invalid character detected!!!”.
        -If it is a special character, then print “Special character is =
        {givenCharacter}”.
         */
        System.out.println("\n***** TASK 6 *****");
        char character1 = '#';

        boolean isLetter = (character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122);
        boolean isDigit = character1 >= 48 && character1 <= 57;

        if (isLetter || isDigit) System.out.println("Invalid character detected!!!");
        else System.out.println("Special character is = " + character1);

        /*
        TASK-7 (Find if given char is a letter or digit or special character)
        -Assume you are given a single character. (It will be hard-coded)
        -If given char is a letter, then print “Character is a letter”
        -If given char is a digit, then print “Character is a digit”
        -Otherwise, print “Character is a special character”
         */
        System.out.println("\n***** TASK 7 *****");
        char charT7 = '#';

        isLetter = (charT7 >= 65 && charT7 <= 90) || (charT7 >= 97 && charT7 <= 122);
        isDigit = charT7 >= 48 && charT7 <= 57;

        if (isLetter) System.out.println("Character is a letter"); // single bit of code doesn't require { }
        else if (isDigit) {
            System.out.println("Character is a digit");
        }
        else System.out.println("Character is a special character");
    }
}