package projects;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

import static utilities.ScannerHelper.getAString;

public class Project04 {
    public static void main(String[] args) {

        System.out.println("\n==========TASK1==========\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String:");
        String str = input.nextLine();

        if (str.length() >= 8) {

            String s1 = str.substring(0, 4);
            String s2 = str.substring(4, str.length() - 4);
            String s3 = str.substring(str.length() - 4);

            System.out.println(s3 + s2 + s1);
        }
        else {
        System.out.println("This String does not have 8 characters");
        }

        System.out.println("\n==========TASK2==========\n");

        String s4 = ScannerHelper.getAString();

        if (s4.trim().contains(" ")) {
            String s5 = s4.substring(0, s4.indexOf(' '));
            String s6 = s4.substring(s4.indexOf(' '), s4.lastIndexOf(' ') + 1);
            String s7 = s4.substring(s4.lastIndexOf(' ') + 1);
            System.out.println(s7 + s6 + s5);

        } else
            System.out.println("This sentence does not have 2 or more words to swap");

        System.out.println("\n==========TASK3==========\n");

        String str1 = ScannerHelper.getAString();

        System.out.println(str1.replace("stupid", "nice").replace("idiot", "nice"));


        System.out.println("\n==========TASK4==========\n");

        String str2 = ScannerHelper.getAName();

        if (str2.length() > 2) {
            if (MathHelper.isOdd(str2.length())) {
                System.out.println(str2.charAt(str2.length() / 2));
            } else System.out.println(" " + str2.charAt(str2.length() / 2 - 1) + (str2.charAt(str2.length() / 2)));

        } else System.out.println("Invalid input!!!");


        System.out.println("\n==========TASK5==========\n");

        String str3 = ScannerHelper.getAString();

        if (str3.length() > 5) { System.out.println(str3.substring(2, str3.length() - 2));
        }
        else System.out.println("Invalid input!!!");

        System.out.println("\n==========TASK6==========\n");

        System.out.println(ScannerHelper.getAString()

        .replace('a', '*').replace('A', '*')
        .replace('e', '#').replace('E', '#')
        .replace('i', '+').replace('I', '+')
        .replace('u', '$').replace('U', '$')
        .replace('o', '@').replace('O', '@'));

        System.out.println("\n==========TASK7==========\n");

        int randomNum1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int randomNum2 = RandomNumberGenerator.getARandomNumber(0, 25);

        String str4 = "";

        if (randomNum1 > randomNum2) {
            for (int i = randomNum2; i < randomNum1; i++) {
                if (i % 5 != 0) str4 += i + " - ";
            }
        }
        else {
            for (int i = randomNum1; i < randomNum2; i++) {
                if (i % 5 != 0) str4 += i + " - ";
            }
        }

        if (!str4.isEmpty()) { System.out.println(str4.substring(0, str4.length() - 3));
        }
        else System.out.println(str4);

        System.out.println("\n==========TASK8==========\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter sentence:");
        String sentence = scanner.nextLine();

        int countWords = 0;

        if (sentence.contains(" ")) {

            for (int i = 0; i < sentence.length(); i++)
                if (sentence.charAt(i) == ' ') {
                    countWords++;
                    System.out.println("This sentence has " + (countWords + 1) + " words.");

                } else System.out.println("This sentence does not have multiple words");
        }

        System.out.println("\n==========TASK9==========\n");

        System.out.println("Please enter a positive number:");
        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\n==========TASK10==========\n");

        System.out.println("Please enter a word");
        String word1 = scanner.nextLine();

        String reversedWords = "";

        if (word1.length() != 0) {
            for (int i = word1.length() - 1; i >= 0; --i) {
                reversedWords += word1.charAt(i);
            }
            if (word1.equals(reversedWords)) { System.out.println("This word is palindrome");
            }
                else System.out.println("This word is not palindrome");
            }       else System.out.println("This word does not have 1 or more characters");

        System.out.println("\n==========TASK11==========\n");

        System.out.println("Please enter a sentence:");
        String s8 = scanner.nextLine().toLowerCase();

        int charCount = 0;

        if(s8.length() != 0){
            for (int i = 0; i < s8.length(); i++){
                if(s8.charAt(i) == 'a') {charCount++;}}System.out.println("This sentence has " + charCount + " A or a letters");}
                    else System.out.println("This sentence does not have any characters");


        }

    }

