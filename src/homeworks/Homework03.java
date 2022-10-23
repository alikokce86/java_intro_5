package homeworks;

import java.security.interfaces.DSAPublicKey;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("\n============TASK-1============\n");

        System.out.println("Please enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The absolute difference between 2 numbers is: " + Math.abs(num1 - num2));

        System.out.println("\n============TASK-2============\n");

        // OR   int num_1, num_2, ......

        System.out.println("Please enter 5 numbers:");
        int num_1 = input.nextInt();
        int num_2 = input.nextInt();
        int num_3 = input.nextInt();
        int num_4 = input.nextInt();
        int num_5 = input.nextInt();

        //solution
        //System.out.println("Max value = " + Math.max(num_1, (Math.max(Math.max(num_2, num_3), Math.max(num_4, num_5)))));
        //System.out.println("Min value = " + Math.min(Math.min(input1, Math.min(input2, input3)),Math.min(input4, input5)));

        System.out.println("Max value = " + Math.max(Math.max(Math.max(num_1, num_2),Math.max(num_3, num_4)), num_5));
        System.out.println("Min value = " + Math.min(Math.min(Math.min(num_1, num_2),Math.min(num_3, num_4)), num_5));


        System.out.println("\n============TASK-3============\n");

        int random1 = (int)(Math.random() * (100 - 50 + 1) + 50);
        int random2 = (int)(Math.random() * (100 - 50 + 1) + 50);
        int random3 = (int)(Math.random() * (100 - 50 + 1) + 50);

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("The sum of the numbers is = " + (random1 + random2 + random3));

        System.out.println("\n============TASK-4============\n");

        double alexMoney = 125; double mikeMoney = 220;

        alexMoney -= 25.5;
        mikeMoney += 25.5;

        System.out.println("Alex's money: $" + alexMoney);
        System.out.println("Mike's money: $" + mikeMoney);

        System.out.println("\n============TASK-5============\n");

        double bicycle = 390; double saveForDave = 15.60;
        double days = bicycle / saveForDave;

        int days25 = (int)(days);
        System.out.println(days25);

        System.out.println("\n============TASK-6============\n");

        String s1 = "5", s2 = "10";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("Sum of 5 and 10 is = " + (i1 + i2));
        System.out.println("Product of 5 and 10 is = " + i1 * i2);
        System.out.println("Division of 5 and 10 is = " + i1 / i2);
        System.out.println("Subtraction of 5 and 10 is = " + (i1 - i2));
        System.out.println("Remainder of 5 and 10 is = " + i1 % i2);

        System.out.println("\n============TASK-7============\n");

        String string1 = "200", string2 = "-50";
        int int1 = Integer.parseInt(string1);
        int int2 = Integer.parseInt(string2);

        System.out.println("The greatest value is =" + Math.max(int1, int2));
        System.out.println("The smallest value is =" + Math.min(int1, int2));
        System.out.println("The average value is =" + (int1 + int2) / 2);
        System.out.println("The absolute difference value is =" + Math.abs(int1 - int2));

        System.out.println("\n============TASK-8============\n");

        double quarters = 3 * 0.25;
        double dime = 0.10;
        double nickels = 2 * 0.05;
        double penny = 0.01;
        double perDay = quarters + dime + nickels + penny;
        double save24 = 24 / perDay;
        double save168 = 168 / perDay;
        double save5months = 5 * 30 * perDay;

        int allSavings = (int)(save24);
        int allSavings2 = (int)(save168);

        System.out.println(allSavings + " days.");
        System.out.println(allSavings2 + " days.");
        System.out.println("$" + save5months);

        System.out.println("\n============TASK-9===========\n");

        double newComputer = 1250;
        double inADay = 62.5;
        double manyDays = newComputer / inADay;

        int newComp = (int)(manyDays);
        System.out.println(newComp);

        System.out.println("\n============TASK-10===========\n");

        /*

        // solution

        double moneyToSave = 14_265;
        double option1 = 475.5;
        double option2 = 951;

        System.out.println("Option 1 will take " + (int)(moneyToSave/option1) + " months");
        System.out.println("Option 2 will take " + (int)(moneyToSave/option2) + " months");

         */

        double newCar = 14265;
        double opt1 = 475.50;
        double opt2 = 951;
        double option1 = newCar / opt1;
        double option2 = newCar / opt2;
        int finalNumbOfMonths = (int)(option1);
        int finalNumbOfMonths2 = (int)(option2);

        System.out.println("Option 1 will take " + finalNumbOfMonths + " months");
        System.out.println("Option 2 will take " + finalNumbOfMonths2 + " months");


        System.out.println("\n============TASK-11===========\n");

        System.out.println("Please enter 2 numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println((double) number1/(double) number2);
        // double divide = (double) number1/(double) number2;


        System.out.println("\n============TASK-12===========\n");

        // int myRandom1, myRandom2, myRandom3;

        // bigger - smaller + 1

        int myRandom1 = (int) (Math.random() * 101);  // (100 - 0 + 1)
        int myRandom2 = (int) (Math.random() * 101);
        int myRandom3 = (int) (Math.random() * 101);

        System.out.println((myRandom1 > 25) && (myRandom2 > 25) && (myRandom3 > 25));  // solution

        System.out.println("\n============TASK-13===========\n");

        System.out.println("Please enter a number between 1 to 7:");
        int dayOfTheWeek = input.nextInt();

        if (dayOfTheWeek == 1) System.out.println("The number entered returns MONDAY");
        else if (dayOfTheWeek == 2) System.out.println("The number entered returns TUESDAY");
        else if (dayOfTheWeek == 3) System.out.println("The number entered returns WEDNESDAY");
        else if (dayOfTheWeek == 4) System.out.println("The number entered returns THURSDAY");
        else if (dayOfTheWeek == 5) System.out.println("The number entered returns FRIDAY");
        else if (dayOfTheWeek == 6) System.out.println("The number entered returns SATURDAY");
        else if (dayOfTheWeek == 7) System.out.println("The number entered returns SUNDAY");
        else System.out.println("Number is not within 1 and 7");

        // switch method  ---  DOES NOT CHECK ONE BY ONE, ROLLS IT FASTER
        /*
        switch (dayOfTheWeek){
            case (1):
                System.out.println("MONDAY");
                break;
            case (2):
                System.out.println("TUESDAY");
                break;
            case (3):
                System.out.println("WEDNESDAY");
                break;
            case (4):
                System.out.println("THURSDAY");
                break;
            case (5):
                System.out.println("FRIDAY");
                break;
            case (6):
                System.out.println("SATURDAY");
                break;
            case (7):
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Number is not within 1 and 7");
                break;
         */


        System.out.println("\n============TASK-14===========\n");

        /*

        int examResults1, examResults2, examResults3;

        System.out.println("What are the three grades?");
        examResults1 = input.nextInt();
        examResults2 = input.nextInt();
        examResults3 = input.nextInt();

        System.out.println(average);
        if(average >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!);

        */

        System.out.println("Tell me your first exam results?");
        int examResults1 = input.nextInt();
        input.nextLine();

        System.out.println("Tell me your second exam results?");
        int examResults2 = input.nextInt();
        input.nextLine();

        System.out.println("Tell me your third exam results?");
        int examResults3 = input.nextInt();

        int averageOf3Exams = (examResults1 + examResults2 + examResults3) / 3;

        if(averageOf3Exams >= 70) System.out.println("YOU PASSED!");
        else if (averageOf3Exams < 70) System.out.println("YOU FAILED!");

        System.out.println("\n============TASK-15===========\n");

        /*

        int match1, match2, match3;
        System.out.println("Please enter 3 numbers");
        match1 = input.nextInt();
        match2 = input.nextInt();
        match3 = input.nextInt();

        if(match1 == match2 && match2 == match3) System.out.println("TRIPLE MATCH");
        else if(match1 == match2 || match2 == match3 || match1 == match3) System.out.println("DOUBLE MATCH");
        else System.out.println("TRIPLE MATCH");
        */
        System.out.println("Enter 3 numbers");
        int nUMBer1 = input.nextInt();
        int nUMBer2 = input.nextInt();
        int nUMBer3 = input.nextInt();

        if(nUMBer1 == nUMBer2 && nUMBer2 == nUMBer3) System.out.println("TRIPLE MATCH");
        else if (nUMBer1 != nUMBer2 && nUMBer2 != nUMBer3) System.out.println("DOUBLE MATCH!");
        else System.out.println("NO MATCH!");



    }
}


