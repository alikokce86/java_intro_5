package homeworks;

import java.util.Scanner;

public class Homework05_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========TASK1==========\n");

        String answer = "";

        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0) answer += i + " - ";
        }
        System.out.println(answer.substring(0, answer.length()-3));


        System.out.println("\n==========TASK2==========\n");

        answer = "";

        for (int i = 1; i <= 50; i++) {
            if(i % 2 == 0 && i % 3 == 0) answer += i + " - ";
        }
        System.out.println(answer.substring(0, answer.length()-3));


        System.out.println("\n==========TASK3==========\n");

        answer = "";

        for (int i = 100; i >= 50; i--) {
            if(i % 5 == 0) answer += i + " - ";
        }
        System.out.println(answer.substring(0, answer.length()-3));


        System.out.println("\n==========TASK4==========\n");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + (i*i));
        }


        System.out.println("\n==========TASK5==========\n");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println("\n==========TASK6==========\n");

        int num, factorial = 1;
        System.out.println("Please enter a number");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);


        System.out.println("\n==========TASK7==========\n");

        int counter = 0;

        System.out.println("Please enter your full name");
        scanner.nextLine();
        String fullname = scanner.nextLine();

        for (int i = 0; i < fullname.length(); i++) {
            if(fullname.toLowerCase().charAt(i) == 'a'||
                    fullname.toLowerCase().charAt(i) == 'e'||
                    fullname.toLowerCase().charAt(i) == 'i'||
                    fullname.toLowerCase().charAt(i) == 'o'||
                    fullname.toLowerCase().charAt(i) == 'u') counter++;
        }
        System.out.println("There are " + counter + " vowel letters in this full name");


        System.out.println("\n==========TASK8==========\n");

        sum = 0;
        counter = 0;

        do {
            System.out.println("Please enter a number");
            sum += scanner.nextInt();
            counter++;
        }while(sum < 100);

        if (counter == 1) System.out.println("This number is already more than 100");
        else System.out.println("Sum of the entered numbers is at least 100");


        System.out.println("\n==========TASK9==========\n");

        int prevNum, nextNum = 1, numCurrent = 0;
        answer = "";

        num =scanner.nextInt();

        for (int i = 0; i < num; i++) {
            answer += numCurrent + " - ";

            prevNum = numCurrent;
            numCurrent = nextNum;
            nextNum = prevNum + numCurrent;
        }
        System.out.println(answer.substring(0, answer.length()-3));


        System.out.println("\n==========TASK10==========\n");
        scanner.nextLine();
        String name;

        do {
            System.out.println("Please enter a name");
            name = scanner.nextLine();
        }while(name.toLowerCase().charAt(0) != 'j');

    }
}