package homeworks;

import java.util.Scanner;

public class Homework03_Solution{
    public static void main(String[] args) {

        System.out.println("---Task1---");

        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Hey User, please enter the first number: ");
        num1 = scanner.nextInt();

        System.out.println("Hey User, please enter the second number: ");
        num2 = scanner.nextInt();

        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));

        System.out.println("\n------Task2------\n");

        int input1, input2, input3, input4, input5;

        System.out.println("Hey User, please enter the first number: ");
        input1 = scanner.nextInt();

        System.out.println("Hey User, please enter the second number: ");
        input2 = scanner.nextInt();

        System.out.println("Hey User, please enter the third number: ");
        input3 = scanner.nextInt();

        System.out.println("Hey User, please enter the fourth number: ");
        input4 = scanner.nextInt();

        System.out.println("Hey User, please enter the fifth number: ");
        input5 = scanner.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(input1, Math.max(input2, input3)),Math.max(input4, input5)));
        System.out.println("Min value = " + Math.min(Math.min(input1, Math.min(input2, input3)),Math.min(input4, input5)));

        System.out.println("\n------Task3------");

        int random1 = (int) (Math.random() * (51) + 50),
            random2 = (int) (Math.random() * (51) + 50),
            random3 = (int) (Math.random() * (51) + 50);

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("The sum of numbers is = " + (random1 + random2 + random3));

        System.out.println("\n------Task4------");

        double alexMoney = 125;
        double mikeMoney = 220;
        double loan = 25.5;


        System.out.println("Alex's money: $" + (alexMoney - loan));
        System.out.println("Mike's money: $" + (mikeMoney + loan));

        System.out.println("\n------Task5------");

        int costOfBike = 390;
        double dailySavings = 15.60;
        int days = (int) (costOfBike / dailySavings);

        System.out.println(days);

        System.out.println("\n------Task6------");

        String s1 = "5", s2 = "10";

        int i1 = Integer.parseInt(s1); // or Integer.valueOf()
        int i2 = Integer.parseInt(s2);

        System.out.println("Sum of 5 and 10 is = " + (i1 + i2));
        System.out.println("Product of 5 and 10 is = " + (i1 * i2));
        System.out.println("Division of 5 and 10 is = " + (i1 / i2));
        System.out.println("Subtraction of 5 and 10 is = " + (i1 - i2));
        System.out.println("Remainder of 5 and 10 is = " + (i1 % i2));

        System.out.println("\n------Task7------");

        s1 = "200";
        s2 = "-50";

        i1 = Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);

        System.out.println("The greatest value is = " + Math.max(i1, i2));
        System.out.println("The smallest value is  = " + Math.min(i1, i2));
        System.out.println("The average value is = " + (i1 + i2) / 2);
        System.out.println("The absolute difference is = " + Math.abs(i1 - i2));

        System.out.println("\n------Task8------");

        double quarter = .25;
        double nickel = .05;
        double dime = .1;
        double penny = .01;
        double savingsDaily = (quarter * 3) + (nickel * 2) + (dime * 1) + (penny * 1);
        int daysToSave$24 = (int) (24 / savingsDaily);
        int daysToSave$168 = (int) (168 / savingsDaily);

        System.out.println(daysToSave$24 + " days");
        System.out.println(daysToSave$168 + " days");
        System.out.println("$" + (150 * savingsDaily));

        System.out.println("\n------Task9------");

        int costOfComputer = 1250;
        dailySavings = 62.5;

        System.out.println((int) (costOfComputer / dailySavings));

        System.out.println("\n------Task10------");

        int costOfCar = 14265;
        double option1 = 475.50;
        int option2 = 951;

        int monthsToPay1 = (int) (costOfCar / option1);
        int monthsToPay2 = (costOfCar / option2);

        System.out.println("Option 1 will take " + monthsToPay1 + " months");
        System.out.println("Option 2 will take " + monthsToPay2 + " months");

        System.out.println("\n------Task11------");


        System.out.println("Please enter 2 numbers");
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();

        double divide = (double)inputA / (double)inputB;

        System.out.println(divide);


        System.out.println("\n------Task12------");

        int randomNumber0To100 = (int) (Math.random() * (101));
        int randomNumber0To1001 = (int) (Math.random() * (101));
        int randomNumber0To1002= (int) (Math.random() * (101));

        boolean allLargerThan25 = randomNumber0To100 > 25 && randomNumber0To1001 > 25 && randomNumber0To1002 > 25;

        System.out.println(allLargerThan25);


        System.out.println("\n------Task13------");

        System.out.println("Hey User, please enter a number between 1 and 7: ");
        int userInput1 = scanner.nextInt();

        /*
        if(userInput1 == 1) System.out.println("MONDAY");
         else if (userInput1 == 2) System.out.println("TUESDAY");
         else if (userInput1 == 3) System.out.println("WEDNESDAY");
         else if (userInput1 == 4) System.out.println("THURSDAY");
         else if (userInput1 == 5) System.out.println("FRIDAY");
         else if (userInput1 == 6) System.out.println("SATURDAY");
         else if (userInput1 == 7) System.out.println("SUNDAY");
         else System.out.println("Number entered not within scope");

         */

        switch (userInput1){
            case 1:
                System.out.println("MONDAY");
            case 2:
                System.out.println("TUESDAY");
            case 3:
                System.out.println("WEDNESDAY");
            case 4:
                System.out.println("THURSDAY");
            case 5:
                System.out.println("FRIDAY");
            case 6:
                System.out.println("SATURDAY");
            case 7:
                System.out.println("SUNDAY");
            default: System.out.println("Number entered not within scope");
        }


        System.out.println("\n------Task14------");

        int exam1, exam2, exam3;

        System.out.println("Tell me your exam results?");
        exam1 = scanner.nextInt();
        exam2 = scanner.nextInt();
        exam3 = scanner.nextInt();

        int average = (exam1 + exam2 + exam3) / 3;

        if(average >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");


        System.out.println("\n------Task15------");

        int number1, number2, number3;

        System.out.println("Enter 3 numbers");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();

        if(number1 == number2 && (number2 == number3)){
            System.out.println("TRIPLE MATCH");
        } else if (number1 == number2 || number2 == number3 || number1 == number3) {
            System.out.println("DOUBLE MATCH");
        } else{
            System.out.println("NO MATCH");
        }
    }
}