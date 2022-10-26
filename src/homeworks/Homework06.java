package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("\n==========TASK1==========\n");

        int[] numbers = new int[10];

        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n==========TASK2==========\n");

        String[] str1 = new String[5];

        str1[1] = "abc";
        str1[4] = "xyz";

        System.out.println(str1[3]);
        System.out.println(str1[0]);
        System.out.println(str1[4]);
        System.out.println(Arrays.toString(str1));

        System.out.println("\n==========TASK3==========\n");

        int[] numbers1 = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(numbers1));

        Arrays.sort(numbers1);

        System.out.println(Arrays.toString(numbers1));

        System.out.println("\n==========TASK4==========\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n==========TASK5==========\n");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogs));

        boolean a = false;

        for (String element : dogs)
            if (element.equals("Pluto")) {
                a = true;
                break;
            }
        System.out.println(a);

        System.out.println("\n==========TASK6==========\n");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        //System.out.println(Arrays.bina ....??

        System.out.println("\n==========TASK7==========\n");

        double[] doubleNumbers = {10.5, 20.75, 70.0, 80.0, 15.75};

        System.out.println(Arrays.toString(doubleNumbers));

        for (double doubleNum : doubleNumbers) {
            System.out.println(doubleNum);
        }

        System.out.println("\n==========TASK8==========\n");

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int letters = 0;
        int lowercase = 0;
        int uppercase = 0;
        int digit = 0;
        int special = 0;

        System.out.println(Arrays.toString(characters));

        for (char character : characters) {
            if (Character.isLetter(character)) {
                letters++;
                // if ....??

        System.out.println("\n==========TASK9==========\n");

        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        int uppercase1 = 0;
        int lowercase1 = 0;

        System.out.println(Arrays.toString(objects));

        for (String object : objects) {
            if (Character.isLowerCase(object.charAt(0))) uppercase1++;
            if (Character.isUpperCase(object.charAt(0))) lowercase1++;

                }
            System.out.println("Elements starts with uppercase = " + uppercase1);
            System.out.println("Elements starts with lowercase = " + lowercase1);

            }

        System.out.println("\n==========TASK10==========\n");

        int[] numbers2 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        System.out.println(Arrays.toString(numbers2));

        int moreThen10 = 0, lessThen10 = 0, equalsTo10 = 0;
        for (int number : numbers2) {
            if (number > 10) moreThen10++;
                //else if (number ??
        }
        System.out.println("Elements that are more than 10 = " + moreThen10);


        System.out.println("\n==========TASK11==========\n");

        int[] numb1 = {5, 8, 13, 1, 2};
        int[] numb2 = {9, 3, 67, 1, 0};
        int[] numb3 = new int[5];

        for (int i = 0; i <= 4; i++) {numb3[i] = Math.max(numb1[i], numb2[i]);}

        System.out.println("1st array is = " + Arrays.toString(numb1));
        System.out.println("2nd array is = " + Arrays.toString(numb2));
        System.out.println("3rd array is = " + Arrays.toString(numb3));

        break;





        }
    }
}

