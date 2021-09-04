package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Controlflowexercise {
    public static void main (String[] args){
        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,9,7,10,12,14,13,11, 20));

        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for(int i = 0; i < integerArray.length; i++){
            System.out.println(integerArray[i]);
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

        int totals = SumEvenNumber.sumOfEven(numbers);
        System.out.println("Sum of Even Number : " + totals);
    }
}


