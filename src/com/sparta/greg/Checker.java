package com.sparta.greg;

//1. Palindrome Checker
//Create a program that takes a String as a parameter and returns true if it is a palindrome

public class Checker {
    public static void palindromeChecker() {
        String palindrome1 = "racecar";
        Printer.printMessage("Word to be checked:: "+palindrome1);
        //Printer.printMessage(" "+palindrome1.charAt(0));

        for(int i=0;i<((palindrome1.length()-1)/2);i++) {
            if (palindrome1.charAt(i) == palindrome1.charAt(palindrome1.length()-1-i)) {
                Printer.printMessage("True");
            } else {
                Printer.printMessage("False, word is not a palindrome");
                break;
            }
        }
    }
}
