package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println("\n=================TASK1===============\n");


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String n1 = input.nextLine();

        System.out.println("The length of the name is = " + n1.length());

        if(!n1.isEmpty()) System.out.println("The first character in the name is = " + n1.charAt(0));
        System.out.println("The last character in the name is = " + n1.charAt(n1.length() - 1));

        if(n1.length() >= 3) System.out.println("The first 3 characters in the name are = " + n1.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + n1.substring(n1.length() - 3));



        if(n1.isEmpty())
            if(n1.toUpperCase().charAt(0) == 'a') System.out.println("You are in the club");
            else System.out.println("Sorry, you are not in the club");
            else System.out.println("Must enter a name!");


        System.out.println("\n=================TASK2===============\n");


        System.out.println("Please enter address:");
        String address1 = input.nextLine();

        if(address1.isEmpty()) System.out.println("The address is required!");
        else if(address1.toLowerCase().contains("Chicago")) System.out.println("You are in the club");
        else if(address1.toUpperCase().contains("Des Plaines")) System.out.println("You are welcome to join the club");
        else System.out.println("Sorry, you will never be in the club");


        System.out.println("\n=================TASK3===============\n");


        System.out.println("Please enter 4 colors:");
        String colors = input.nextLine().toLowerCase();

        if(!colors.isEmpty())
            if(colors.contains("red") && colors.contains("green")) System.out.println("Green and red are in the list");
        else if(!colors.contains("red") || !colors.contains("green")) System.out.println("Green and red are not in the list");
        else if(colors.contains("green")) System.out.println("Green is in the list");
        else System.out.println("Red is in the list");
        else System.out.println("Didn't enter any color");


        System.out.println("\n=================TASK4===============\n");


        String str = "   Java is FUN   ";

        str = str.toLowerCase().trim();
        String str1 = str.substring(0, str.indexOf(' '));
        String str2 = str.substring(str.indexOf(' ') + 1, str.lastIndexOf(' '));
        String str3 = str.substring(str.lastIndexOf(' ') + 1);

        System.out.println("The first word in the str is = " + str1);
        System.out.println("The second word in the str is = " + str2);
        System.out.println("The third word in the str is = " + str3);








    }
}









