package org.launchcode;
import java.util.Scanner;

public class WordSearch {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";

        System.out.println("Enter the word to search -");
        String word = input.nextLine();
        boolean present = sentence.toLowerCase().contains(word.toLowerCase());
        System.out.println("Word search in the sentence is - "+present);

        int index= sentence.indexOf(word);
        System.out.println("Index of "+word+ " in sentence is "+ index);
        int wordLength = word.length();
        System.out.println("Length of "+word+ " in the sentence "+ wordLength);
        input.close();
        String modifiedSentence = sentence.replace(word,"");
        System.out.println(modifiedSentence);

    }
}
