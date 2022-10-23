package practice;

import java.util.Scanner;

public class PrintingSamples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int costOfBike = 390;
        double dailySavings = 15.60;
        int days = (int) (costOfBike / dailySavings);

        System.out.println(days);


        int costOfComputer = 1250;
        dailySavings = 62.5;

        System.out.println((int) (costOfComputer / dailySavings));


        double newComputer = 1250;
        double inADay = 62.5;
        double manyDays = newComputer / inADay;

        int newComp = (int)(manyDays);
        System.out.println(newComp);


    }
}
