package com.codecool.cracking;

/* Question 1.1 - Is Unique
    Implement an algorithm to determine if all characters in a string are unique.
    What if you cannot use additional data structures?
 */

/* Notes
    Questions:
    - What do we mean by characters? Full ASCII / Unicode? Or just letters of the alphabet?
        From internet: Unicode standard latin has 1338 characters. ASCII standard has 128, extended has 256.
    - Are small and caps unique?
    - What do we mean by "additional" data structures? Can't use an inner list, can't sort the string?

    Let's go with standard ASCII.
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        String firstString = "This is a test string that should fail miserably.";

        System.out.println(main.isAllUniqueCharsBruteForce(firstString));
    }

    // Brute force solution - compares every character to rest of the string (no additional data structure, though).
    private boolean isAllUniqueCharsBruteForce(String inputString) {
        if (inputString.length() > 128) return false;

        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j < inputString.length(); j++) {
                if (inputString.substring(i, i+1).equals(inputString.substring(j, j+1))) {
                    return false;
                }
            }
        }
        return true;
    }

}
