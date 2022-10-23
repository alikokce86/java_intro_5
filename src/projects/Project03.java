package projects;

import mathClass.MathRandomMethod;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("=======TASK1=======\n");

        String s1 = "24", s2 = "5";

        int i1 = Integer.valueOf(s1);
        int i2 = Integer.valueOf(s2);


        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (i1 + i2));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " = " + (i1 - i2));
        System.out.println("The division of " + s1 + " and " + s2 + " = " + ((double)i1 / i2));
        System.out.println("The multiplication  of " + s1 + " and " + s2 + " = " + (i1 * i2));
        System.out.println("The remainder  of " + s1 + " and " + s2 + " = " + (i1 % i2));

        System.out.println();

        System.out.println("=======TASK2=======\n");

        //(int)(randomNumber * (big point - small point + 1) + start

        int num1 = (int) (Math.random() * 35) + 1;
        System.out.println(num1);

        if ((num1 == 2) || (num1 == 3) || (num1 == 5) || (num1 == 7) || (num1 != 3)) {
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        } else {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        }

        System.out.println();
        System.out.println("=======TASK3=======\n");

        int random1 = (int) (Math.random() * 50) + 1;
        int random2 = (int) (Math.random() * 50) + 1;
        int random3 = (int) (Math.random() * 50) + 1;

        System.out.println("Random number 1 = " + random1);
        System.out.println("Random number 2 = " + random2);
        System.out.println("Random number 3 = " + random3);

        int maxNum = Math.max(Math.max(random1, random2), random3);
        int minNum = Math.min(Math.min(random1, random2), random3);

        System.out.println("Lowest number is = " + minNum);

        if (random1 < maxNum && random1 > minNum) System.out.println("Middle number is = " + random1);
        else if (random2 < maxNum && random2 > minNum) System.out.println("Middle number is = " + random2);
        else System.out.println("Middle number is = " + random3);
        System.out.println("Greatest number is = " + maxNum);


        System.out.println();
        System.out.println("=======TASK4=======\n");

        char char1 = 'A';
        if (char1 >= 65 && char1 <= 90) System.out.println("The letter is uppercase");
        else if (char1 >= 65 && char1 <= 90) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");

        System.out.println();
        System.out.println("=======TASK5=======\n");

        char c1 = 'T';
        if (c1 >= 65 && c1 <= 90 || c1 >= 97 && c1 <= 122) {
            if (c1 == 65 || c1 == 69 || c1 == 73 || c1 == 79 || c1 == 85 || c1 == 89 ||
                    c1 == 97 || c1 == 101 || c1 == 105 || c1 == 111 || c1 == 117 || c1 == 121) {
                System.out.println("The letter is vowel");
            } else {
                System.out.println("The letter is consonant");
            }
        }else {
            System.out.println("Invalid character detected!!!");
        }

        System.out.println();
        System.out.println("=======TASK6=======\n");

        char a1 = '%';
        if(a1 >= 65 && a1 <= 90 || a1 >= 97 && a1 <= 122 || a1 >= 48 && a1 <= 57){
            System.out.println("Invalid character detected!!!");
        }
        else System.out.println("Special character is = " + a1);

        System.out.println();
        System.out.println("=======TASK7=======\n");

        char b1 = '1';
        if(b1 >= 65 && b1 <= 90 || b1 >= 97 && b1 <= 122) System.out.println("Character is a letter");
        else if(b1 >= 48 && b1<=57) System.out.println("Character is a digit");
        else System.out.println("Character is a special character");

    }
}
