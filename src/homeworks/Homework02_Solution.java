package homeworks;

import java.util.Scanner;

public class Homework02_Solution {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("---------------Task 1---------------");

        System.out.println("Please enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1+num2;

        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + sum);


        System.out.println("---------------Task 2---------------");

        System.out.println("Please enter 2 numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        int product = num1*num2;

        System.out.println("The product of the given 2 numbers is: " + product);


        System.out.println("---------------Task 3---------------");
        System.out.println("Please enter 2 numbers");

        double num1Double = scanner.nextDouble();
        double num2Double = scanner.nextDouble();

        System.out.println("The sum of the given numbers is = " + (num1Double+num2Double));
        System.out.println("The product of the given numbers is = " + (num1Double*num2Double));
        System.out.println("The subtraction of the given numbers is = " + (num1Double-num2Double));
        System.out.println("The division of the given numbers is = " + (num1Double/num2Double));
        System.out.println("The remainder of the given numbers is = " + (num1Double%num2Double));


        System.out.println("---------------Task 4---------------");

        System.out.println("1.\t" + (-10 + 7 * 5));
        System.out.println("2.\t" + (72+24) % 24 );
        System.out.println("3.\t" + (10 + -3*9 / 9));
        System.out.println("4.\t" + ( 5 + 18 / 3 * 3 - (6 % 3) ) );



        System.out.println("---------------Task 5---------------");

        System.out.println("Please enter 2 numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println("The average of the given numbers is: " + (num1+num2)/2);

        System.out.println("---------------Task 6---------------");

        System.out.println("Please enter 5 numbers");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int average = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("The average of the given numbers is: " + average);

        System.out.println("---------------Task 7---------------");

        System.out.println("Please enter 3 numbers");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.println("The " + num1 + " multiplied with " + num1 + " is = " + num1 * num1);
        System.out.println("The " + num2 + " multiplied with " + num2 + " is = " + num2 * num2);
        System.out.println("The " + num3 + " multiplied with " + num3 + " is = " + num3 * num3);


        System.out.println("---------------Task 8---------------");
        System.out.println("Please enter the length of your square");
        int num = scanner.nextInt();

        System.out.println("Perimeter of the square = " + (4*num));
        System.out.println("Area of the square = " + (num*num));

        System.out.println("---------------Task 9---------------");
        double salary = 90000;
        System.out.println("A Software Engineer in Test can earn $" + (salary * 3) + " in 3 years.");

        scanner.nextLine();
        System.out.println("---------------Task 10---------------");

        System.out.println("Whats your favorite book ");
        String favBook = scanner.nextLine();

        System.out.println("Whats your favorite color ");
        String favColor = scanner.nextLine();

        System.out.println("Whats your favorite number ");
        int favNumber= scanner.nextInt();

        System.out.println("User's favorite book is: " + favBook +
                "\nUser's favorite color is: " + favColor +
                "\nUser's favorite number is: " + favNumber);

        scanner.nextLine();
        System.out.println("---------------Task 11---------------");

        String fName, lName, email, number, address;
        int age;
        System.out.println("What is your first name: ");
        fName = scanner.nextLine();

        System.out.println("What is your last name: ");
        lName = scanner.nextLine();

        System.out.println("What is your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your email address: ");
        email = scanner.nextLine();

        System.out.println("What is your phone number: ");
        number = scanner.nextLine();

        System.out.println("What is your address: ");
        address = scanner.nextLine();

        System.out.println("\tUser who joined this program is " + fName +
                " " + lName +". " + fName + "'s age is \n"
                + age + ". " + fName + "'s email address is " + email + ", phone number is \n"
                + number + ", and address is " + address + ".");

    }
}