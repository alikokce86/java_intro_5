package casting;

public class CastingChars {
    public static void main(String[] args) {

        int i1 = 65;

        System.out.println(i1); // 65

        char c1 = (char)i1;

        System.out.println(c1); // A
                                              ///  ASCII TABLE  \\\
        System.out.println(51); // 51
        System.out.println((char) 51); // 3

        System.out.println((char) 123); // {

        System.out.println((char) 32); // space

        System.out.println((char) 1986); // ߂

        char char1 = 'A'; // A
        char char2 = 97; // 'a' ( ASCII )

        System.out.println(char1 + char2); // 65 + 97 -> 162
        System.out.println("" + char1 + char2); // Aa
        System.out.println("" + (char1 + char2)); // 162
        System.out.println(char1 + char2 + ""); // 162
        System.out.println(char1 + "" + char2); // Aa

        /*
        primitive + String 		-> String
        String + primitive 		-> String
        p + p + S 				-> number String
        'A' + "" + 'a' 			-> Aa

        p + p + p + S + p + p + p 	-> string
        1 + 1 + 1 + "" + 1 + 1 + 1  -> 3111
        1 + 1 + 1 + "" + (1 + 1 + 1)-> 33
         */


    }
}
