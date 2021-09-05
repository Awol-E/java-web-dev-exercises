package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintWord {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> word = new ArrayList<>();
        word.add("Mercury");
        word.add("Venus");
        word.add("Mars");
        word.add("Super");
        word.add("Saturn");
        word.add("Words");
        word.add("Bonus");

        System.out.println("Enter a word length to search:");
        int numChars = input.nextInt();

        for(String s : word){
            if(s.length() == numChars){
                System.out.println(s);
            }
        }
        System.out.println("=== That is all ! ======");
    }
}
