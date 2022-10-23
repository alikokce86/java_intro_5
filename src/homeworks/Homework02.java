

package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n=================TASK1===============\n");

        int num1, num2;

        System.out.println("Please enter number 1:");
        num1 = input.nextInt();
        System.out.println("The number 1 entered by user is = " + num1);

        System.out.println("Please enter number 2:");
        num2 = input.nextInt();
        System.out.println("The number 2 entered by user is = " + num2);

        int sum = num1 + num2;
        System.out.println("The sum of number 1 and 2 entered by user is = " + sum);


        System.out.println("\n=================TASK2===============\n");

        int numb1,numb2;

        System.out.println("Please enter number 1:");
        numb1 = input.nextInt();

        System.out.println("Please enter number 2:");
        numb2 = input.nextInt();
        System.out.println("The product of the given 2 numbers is: " + (numb1 * numb2));


        System.out.println("\n=================TASK3===============\n");

        double number1, number2;

        System.out.println("Please enter number 1");
        number1 = input.nextDouble();

        System.out.println("Please enter number 2");
        number2 = input.nextDouble();

        System.out.println("The sum of the given numbers is = " + (number1 + number2));
        System.out.println("The product of the given numbers is = " + (number1 * number2));
        System.out.println("The subtraction of the given numbers is = " + (number1 - number2));
        System.out.println("The division of the given numbers is = " + (number1 / number2));
        System.out.println("The remainder of the given numbers is = " + (number1 % number2));



        System.out.println("\n=================TASK4===============\n");

        System.out.println("1. " + (-10 + (7 * 5)));
        System.out.println("2. " + (72+24) % 24);
        System.out.println("3. " + (10 + -3*9 / 9));
        System.out.println("4.\t" + ( 5 + 18 / 3 * 3 - (6 % 3) ) );

        // System.out.println("4. " + (5 + 18 / (3 * 3) – (6 % 3)));  /// Could not solve it, gives error

        System.out.println("\n=================TASK5===============\n");

        int numBer1, numBer2;
        System.out.println("Please enter number 1:");
        numBer1 = input.nextInt();

        System.out.println("Please enter number 2:");
        numBer2 = input.nextInt();

        System.out.println("The average of the given numbers is: " + (numBer1 + numBer2) / 2);


        System.out.println("\n=================TASK6===============\n");

       /*
        // int number1, number2, number3, number4, number5;

        System.out.println("Please enter a number:");
        number1 = input.nextInt();
        System.out.println("Please enter another number:");
        number2 = input.nextInt();
        System.out.println("Please enter another number:");
        number3 = input.nextInt();
        System.out.println("Please enter another number:");
        number4 = input.nextInt();
        System.out.println("Please enter another number:");
        number5 = input.nextInt();

        System.out.println("The average of the given 5 numbers is: " +
                (number1 + number2 + number3 + number4 + number5) / 5);
        */

        System.out.println("\n=================TASK7===============\n");

        //int number1, number2, number3;

        System.out.println("Please enter a number:");
        number1 = input.nextInt();

        System.out.println("Please enter another number:");
        number2 = input.nextInt();

        System.out.println("Please enter another number:");
        //number3 = input.nextInt();

        System.out.println("The 5 multiplied with 5 is = " + number1 * number1);
        System.out.println("The 6 multiplied with 6 is = " + number2 * number2);
       // System.out.println("The 10 multiplied with 10 is = " + number3 * number3);


        System.out.println("\n=================TASK8===============\n");

        int side = 7;

        System.out.println("What is the side of the square? :");
        side = input.nextInt();
        System.out.println("Perimeter of the square is = " + 4 * side);
        System.out.println("Area of the square is = " + side * side);


        System.out.println("\n=================TASK9===============\n");

        double yearlySalary = 90000;
        double salaryInThreeYears = 90000 * 3;

        System.out.println("A Software Engineer in Test can earn $" + salaryInThreeYears + " in 3 years.");


        System.out.println("\n=================TASK10===============\n");

        String favBook, favColor, favNumber;
        System.out.println("Please enter your favorite book:");
        favBook = input.nextLine();

        System.out.println("Please enter your favorite color:");
        favColor = input.nextLine();

        System.out.println("Please enter your favorite number:");
        favNumber = input.nextLine();

        System.out.println("User's favorite book is: " + favBook +
                "\n User's favorite color is: " + favColor +
                "\n User's favorite number is: " + favNumber);


        System.out.println("\n=================TASK11===============\n");

        String firstName, lastName, emailAddress, address, phoneNumber;
        int age;

        System.out.println("Please enter your first name:");
        firstName = input.next();

        System.out.println("Please enter your last name:");
        lastName = input.next();

        System.out.println("Please enter your age:");
        age = input.nextInt();

        System.out.println("Please enter your email address:");
        emailAddress = input.next();

        System.out.println("Please enter your phone number:");
        phoneNumber = input.next();

        System.out.println("Please enter your address");
        address = input.next();

        System.out.println("\t User who joined this program is " + firstName + " " + lastName + ". " + firstName +
                "'s " + "age is " + age + ". " + firstName + "'s " + "email\n address is " + emailAddress + ", " +
                "phone number is " + phoneNumber + ", " + "and address\n is " + address + ".");


    }
}