package arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 8, 10};

        //Search for 7 and return true if it exists in this array, return false otherwise -> false

        boolean has7 = false;

        for(int number : numbers){
            if(number == 7) {
                has7 = true;
                break;
            }
        }

        System.out.println(has7); // false

        //Search for 5 and return true if it exists in this array, return false otherwise -> true
        //3, 5, 8, 10

        boolean has5 = false;

        for(int number : numbers){
            if(number == 5) {
                has5 = true;
                break;
            }
        }
        System.out.println(has5);
    }
}
