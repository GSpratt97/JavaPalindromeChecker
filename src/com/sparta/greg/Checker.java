package com.sparta.greg;

//1. Palindrome Checker
//Create a program that takes a String as a parameter and returns true if it is a palindrome

public class Checker {
    public static boolean palindromeChecker(String palindrome1) {

        for(int i=0;i<((palindrome1.length()-1)/2);i++) {
            if (palindrome1.charAt(i) != palindrome1.charAt(palindrome1.length()-1-i)) {
                return false;
            }
        }
        return true;

    }
}
