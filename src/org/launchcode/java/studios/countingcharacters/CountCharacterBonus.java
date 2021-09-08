package org.launchcode.java.studios.countingcharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CountCharacterBonus {
    public static void main(String[] args){
//3.8.3. Bonus Missions
//Try these modifications on your code:
//Prompt the user to enter the string in the command line.
//Make the character counts case-insensitive.
//Exclude non-alphabetic characters.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your own strings: ");
        String myString = scanner.nextLine().toLowerCase(Locale.ROOT);

        System.out.println(myString);
        scanner.close();

        HashMap<Character, Integer> countCharacter = new HashMap<>();
        char[] charactersInString = myString.toCharArray();
        System.out.println(Arrays.toString(charactersInString));

        Character ch;
        Integer count= 0;

        for(char c : charactersInString){
            //ch = c;
           if(!countCharacter.containsKey(c) && !Character.isDigit(c)){
                for(int i = 0; i < charactersInString.length; i++){
                    if(charactersInString[i] == c){
                        count++;
                    }
                }
                countCharacter.put(c, count);
            }
            count=0;
        }
        for (Character l: countCharacter.keySet()) {
            String key = l.toString();
            String value = countCharacter.get(l).toString();
            System.out.println(key + ":" + value);
        }
    }
}
