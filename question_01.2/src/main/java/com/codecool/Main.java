package com.codecool;

/* Question 1.2 - Check Permutation
    Given two strings, write a method to decide if one is a permutation of the other.
 */

/* Notes
    Permutation: rearrange in any way so the strings would match.
    AKA: 2 strings contain the same characters ONLY.

    Question:
    - is it case sensitive? let's say it does
    - do white space, punctuation count? let's say it does
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        String indula = "indula";
        String aludni = "aludni";
        String dab = "dab";
        String bod = "bod";

        System.out.println(main.isPermutation(indula, aludni));
        System.out.println(main.isPermutation(dab, bod));
    }

    private boolean isPermutation(String first_string, String second_string) {
        if (first_string.length() != second_string.length()) return false;
        return sortString(first_string).equals(sortString(second_string));
    }

    private String sortString(String word) {
        char[] wordContent = word.toCharArray();
        Arrays.sort(wordContent);
        return new String(wordContent);
    }
}
