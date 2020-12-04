package com.sparta.greg;

//2. Palindrome Sentence
//Create a program that takes a String as a sentence. It will return a String containing the longest palindrome in the sentence

import javax.lang.model.type.PrimitiveType;
import java.util.ArrayList;

public class Sentence {
    public static String palindromeInSentence(String palindromeSentence){

        // Separate sentence into array of words
        String[] arrayOfWords = palindromeSentence.split(" ");

        // foreach loop to analyse each word if it is palindrome
        boolean palindrome = true;

        ArrayList<String> verifiedPalindromes = new ArrayList<String>();

        for (String palindrome1:arrayOfWords) {

            Printer.printMessage("'"+palindrome1+"' is a palindrome::  "+Checker.palindromeChecker(palindrome1));
            if (Checker.palindromeChecker(palindrome1)){
                verifiedPalindromes.add(palindrome1);
            }

        }
        String longestWord = "";

        for (String word:verifiedPalindromes) {

            if(word.length()>longestWord.length()) {
                longestWord = word;
            }

        }
        //Printer.printMessage("Longest palindrome in sentence is:: "+longestWord);
        return longestWord;
    }
}
