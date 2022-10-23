package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {


        System.out.println("\n---------------Task 1---------------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println();

        int product = num1 * num2 * num3;

        System.out.println("The product of the numbers entered is = " + product);

        System.out.println("\n---------------Task 2---------------\n");

        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("Your first name is " + firstName);
        input.nextLine();

        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.println("Your last name is " + lastName);

        System.out.println("What is your year of birth?");
        int yearOfBirth = input.nextInt();
        int currentYear = 2022;
        System.out.println("Your age is : " + (currentYear - yearOfBirth) + ".");


        System.out.println("\n---------------Task 3---------------\n");

        System.out.println("What is your full name?:");
        String fullName = input.nextLine();
        input.nextLine();

        System.out.println("What is your weight?:");
        double kgWeight = input.nextDouble();
        double lbs = 2.205;
        System.out.println("Your weight is = " + (kgWeight * lbs) + " lbs.");
        // double lbWeight = kgWeight * 2.205;
        // System.out.println(fullName + "'s weight is = " + lbWeight + " lbs.");


        System.out.println("\n---------------Task 4---------------\n");

        System.out.println("What is your full name?");
        String s1FullName = input.nextLine();


        System.out.println("What is your age?");
        int s1Age = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        String s2FullName = input.nextLine();


        System.out.println("What is your age?");
        int s2Age = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        String s3FullName = input.nextLine();

        System.out.println("What is your age?");
        int s3Age = input.nextInt();

        System.out.println(s1FullName + "'s age is " + s1Age + ".");
        System.out.println(s2FullName + "'s age is " + s2Age + ".");
        System.out.println(s3FullName + "'s age is " + s3Age + ".");
        System.out.println("The average age is " + (s1Age + s2Age + s3Age) / 3 + ".");
        System.out.println("The eldest age is " + Math.max(Math.max(s1Age, s2Age), s3Age) + ".");
        System.out.println("The youngest age is " + Math.min(Math.min(s1Age, s2Age), s3Age) + ".");

        /*
        int averageAge = (age1 + age2 + age3) / 3;
        int eldestAge = Math.max(Math.max(age1, age2), age3);
        int youngestAge = Math.min(Math.min(age1, age2), age3);
        System.out.println("The average age is " + averageAge + ".");
        System.out.println("The eldest age is " + eldestAge + ".");
        System.out.println("The youngest age is " + youngestAge + ".");
         */

    }
}
