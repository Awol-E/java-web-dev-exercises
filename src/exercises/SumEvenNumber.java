package exercises;

import java.util.ArrayList;

public class SumEvenNumber {
    public static int sumOfEven(ArrayList<Integer> arr) {
        int total = 0;
        for(int integer : arr){
            if(integer%2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
