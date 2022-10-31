package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("\n==========TASK1==========\n");

        int[] i1 = {10, 7, 7, 10, -3, 10, -3};
        Arrays.sort(i1);
        System.out.println("Smallest = " + i1[1]);
        System.out.println("Greatest = " + i1[i1.length - 1]);

        System.out.println("\n==========TASK2==========\n");

        int[] i2 = {10, 7, 7, 10, -3, 10, -3};
        int number = i2.length;
        int numMin = Integer.MAX_VALUE;
        int numMax = Integer.MIN_VALUE;

        for (int i = 1; i < number; i++) {
            if (i2[i] > numMax)
                numMax = i2[i];
            if (i2[i] < numMin)
                numMin = i2[i];
        }
        System.out.println("Smallest = " + numMin);
        System.out.println("Greatest = " + numMax);
        System.out.println();

        System.out.println("\n==========TASK3==========\n");

        int[] i3 = {10, 5, 6, 7, 8, 5, 15, 15};
        Arrays.sort(i3);

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int number1 : i3) {
            if (number1 < smallest) smallest = number1;
        }
        for (int number1 : i3) {
            if (number1 == smallest);
            else if (number1 < secondSmallest) secondSmallest = number1;

        }

        int greatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        for (int number1 : i3) {
            if (number1 > greatest) greatest = number1;
        }
        for (int number1 : i3) {
            if (number1 == greatest);
            else if (number1 > secondGreatest) secondGreatest = number1;
        }
        System.out.println("Second Smallest = " + secondSmallest + "\nSecond Greatest = " + secondGreatest);

        System.out.println("\n==========TASK4==========\n");

        System.out.println("\n==========TASK5==========\n");

        String[] duplicates = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};

        for (int i = 0; i < duplicates.length; i++) {
            for (int j = i + 1; j < duplicates.length; j++) {
                if (duplicates[i].equals(duplicates[j])){
                    System.out.println(duplicates[j]);
                }
            }
        }
        System.out.println("\n==========TASK6==========\n");

        String[] mostlyRepeated = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        String repeated = "";
        int count = 0;

        for (String tempoRepeated : mostlyRepeated) {
            int tempCount = 0;
            for (int j = 0; j < mostlyRepeated.length; j++) {
                if (mostlyRepeated[j].equals(tempoRepeated)) tempCount++;
            }
            if (tempCount > count) {
                repeated = tempoRepeated;
                count = tempCount;
            }
        }
        System.out.println(repeated);


    }


}


