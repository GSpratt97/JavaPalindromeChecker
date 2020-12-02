package com.sparta.greg;

//2. Palindrome Sentence
//CreatCreate a program that takes a String as a sentence. It will return a String containing the longest palindrome in the sentence

public class Sentence {
    public static void palindromeInSentence(){
        String sentence1 = "This sample sentence with saippuakivikauppias racecar kayak and rotator";
        Printer.printMessage("Sentence to be analysed for palindromes:: "+ sentence1);
        // Separate sentence into array of words
        String[] words = sentence1.split(" ");

        // foreach loop to analyse each word if it is palindrome
        boolean palindrome;
        for (String palindrome1:words) {
            // Print word before analysing
            Printer.printMessage(palindrome1);
            // Run through letters in word, comparing first with last letter
            for (int i = 0; i < ((palindrome1.length() - 1) / 2); i++) {

                // Conditional to check each word
                if (palindrome1.charAt(i) == palindrome1.charAt(palindrome1.length() - 1 - i)) {
                    Printer.printMessage("True");
                    palindrome = true;
                } else {
                    Printer.printMessage("False, '"+palindrome1+"' is not a palindrome");
                    palindrome = false;
                    // If false value break for loop as this word will not be palindrome
                    break;
                }
                if (palindrome == false) {
                    continue;
                } else {
                    Printer.printMessage("'"+palindrome1+"' is a palindrome");
                }
            }
        }
    }
}
