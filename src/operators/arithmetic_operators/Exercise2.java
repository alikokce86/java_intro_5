package operators.arithmetic_operators;

public class Exercise2 {
    public static void main(String[]args){

        /*
        An annual average salary for an SDET in the Unites States is 90k.
        Write a Java program that calculates and prints the monthly and bi-weekly and
        weekly average amount that an SDETs makes in the United States.

        Expected Output
        Monthly: 7500
        Bi-weekly: 3461.5384615384614
        Weekly: 1730.7692307692307
         */

        double yearLySalary = 90_000;

        System.out.println("Monthly: " + yearLySalary / 12);
        System.out.println("Bi-weekly: " + yearLySalary / 26);
        System.out.println("Weekly: " + yearLySalary / 52);

    }
}
