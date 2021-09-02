package exercises;
import java.util.Locale;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but it had no pictures or conversations " +
                "in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a word that is in Alice Adventure note :");

        String searchTerm = input.nextLine();

        if(firstSentence.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println("true");
            System.out.println("index at :" + firstSentence.indexOf(searchTerm.toLowerCase()) );
            Integer index = firstSentence.indexOf(searchTerm);
            Integer length = searchTerm.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedSentence = firstSentence.replace(searchTerm, "");
            System.out.println(modifiedSentence);

        } else {
            System.out.println("false");
        }

    }
}
