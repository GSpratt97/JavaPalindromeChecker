package com.sparta.greg;

public class Starter {
    public static void start() {
        String palindromeWord = "racecar";
        Printer.printMessage("Word to be checked:: "+palindromeWord);
        Printer.printMessage("Is word a palindrome?  "+Checker.palindromeChecker("racecar"));

        Printer.printMessage(" ");

        String palindromeSentence = "This sample sentence with saippuakivikauppias racecar kayak and rotator";
        Printer.printMessage("Sentence to be checked:: "+palindromeSentence);
        Printer.printMessage("Longest palindrome in sentence is:: "+Sentence.palindromeInSentence(palindromeSentence));

    }
}
