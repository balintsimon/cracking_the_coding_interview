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

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        String firstString = "This is a test string that should fail miserably.";
        String passingString = "ABCDEFghijKLMNOo";
        System.out.println(main.isAllUniqueCharsBruteForce(firstString));
        System.out.println(main.isAllUniqueCharsBruteForce(passingString));
        System.out.println(main.isAllUniqueWithSort(firstString));
        System.out.println(main.isAllUniqueWithSort(passingString));
        System.out.println(main.isAllUniqueChars(firstString));
        System.out.println(main.isAllUniqueChars(passingString));
    }

    // Brute force solution - compares every character to rest of the string (no additional data structure, though).
    private boolean isAllUniqueCharsBruteForce(String inputString) {
        if (inputString.length() > 128) return false; // NB: 128 is the length of the ASCII standard table.

        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j < inputString.length(); j++) {
                if (inputString.charAt(i) == (inputString.charAt(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    // Solution with sorting string first - takes less time, like O(n log n)
    private boolean isAllUniqueWithSort(String inputString) {
        if (inputString.length() > 128) return false;

        String sortedString = sortString(inputString);
        for (int i = 0; i < inputString.length()-1; i++) {
            if (sortedString.charAt(i) == (sortedString.charAt(i+1))) return false;
        }

        return true;
    }

    private String sortString(String unsortedString) {
        char[] tempArray = unsortedString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    /* Solution to use hashmap - aim is always to use a map, as it has O(1) access time and has to iterate
      over list only once (O(n) time). It uses "additional data structure" though...

      Additional note: map is not necessary to use here. Could also convert char to ASCII value and
      use its value as index.
    */
    private boolean isAllUniqueChars(String inputString) {
        if (inputString.length() > 128) return false;

        Map<Character, Boolean> characters = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (characters.get(currentChar) != null) {
                return false;
            }
            characters.put(currentChar, true);
        }

        return true;
    }
}
