package homeworks;

import utilities.ScannerHelper;


public class Homework04_Solution {
    public static void main(String[] args) {
        System.out.println("------Task 1------");
        String name = ScannerHelper.getAName();

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println("The first three characters in the name is = " + name.substring(0,3));
        System.out.println("The last three characters in the name is = " + name.substring(name.length()-3));

        if(name.toLowerCase().charAt(0) == 'a') System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");


        System.out.println("\n------Task 2------");

        String address = ScannerHelper.getAnAddress();

        if(address.toLowerCase().contains("chicago"))
            System.out.println("You are in the club!");
        else if(address.toLowerCase().contains("des plaines"))
            System.out.println("You are welcome to join the club!");
        else System.out.println("Sorry, you will never be in the club");

        System.out.println("\n------Task 3------");

        String favColors = ScannerHelper.getFavColors();


        if(favColors.toLowerCase().contains("red") && favColors.toLowerCase().contains("green"))
            System.out.println("Green and red are in the list");
        else if(favColors.toLowerCase().contains("red")) System.out.println("Red is in the list");
        else if(favColors.toLowerCase().contains("green")) System.out.println("Green is in the list");
        else System.out.println("Green and red are not in the list");

        System.out.println("\n------Task 4------");

        String str = "   Java is FUN   ";
        str = str.trim().toLowerCase();

        String word1 = str.substring(0,str.indexOf(' '));
        String word2 = str.substring(str.indexOf(' ') + 1,str.lastIndexOf(' '));
        String word3 = str.substring(str.lastIndexOf(' ') + 1);

        System.out.println("The first word in the str is = " + word1);
        System.out.println("The second word in the str is = " + word2);
        System.out.println("The third word in the str is = " + word3);
    }
}