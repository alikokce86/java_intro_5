package conditional_statements.ternary_operator;

import java.util.Random;

public class Exercise2_FindMin {
    public static void main(String[] args) {

        /*
        TASK
        Write a program that generates 2 random numbers bt 1 and 10
        Find and print the smallest number

        USE TERNARY
         */

        Random random = new Random();
        random.nextInt();

        int num1 = (int)(Math.random() * 10) + 1;
        int num2 = (int)(Math.random() * 10) + 1;

        System.out.println("Random 1 = " + num1);
        System.out.println("Random 2 = " + num2);

        int min = num1 < num2 ? num1 : num2;

        System.out.println("The smallest number is " + min);

    }
}
