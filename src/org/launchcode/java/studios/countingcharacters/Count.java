package org.launchcode.java.studios.countingcharacters;
import java.util.Arrays;
import java.util.HashMap;
import java. util.Scanner;
import java.util.Map;
public class Count {
    public static void main(String[] args){
        String myString = "If the product of two terms is zero then common sense says at least one of " +
            "the two terms has to be zero to start with. So if you move all the terms over to one side, " +
            "you can put the quadratics into a form that can be factored allowing that side of the equation " +
            "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

    HashMap<Character, Integer> countCharacter = new HashMap<>();
    char[] charactersInString = myString.toCharArray();
    System.out.println(Arrays.toString(charactersInString));

        Integer count= 0;

        for(char c : charactersInString){
            if(!countCharacter.containsKey(c)){
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
//        for (Map.Entry<Character, Integer> l : countCharacter.entrySet()) {
//            System.out.println(l.getKey() + " (" + l.getValue() + ")");
//        }
//        countCharacter.entrySet().forEach(entry -> {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });
    }
}
