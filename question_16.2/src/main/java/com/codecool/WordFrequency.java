package com.codecool;

/* Question 16.2. - Word Frequencies
* Design a method to find the frequency of occurrences of any given word in a book.
* What if we were running this algorithm multiple times?
* */

/* Notes
* */

public class WordFrequency {
    public int getWordFrequencyOnce(String[] book, String wordToFind) {
        if (book == null || wordToFind == null) return -1;
        int count = 0;

        wordToFind = wordToFind.trim().toLowerCase();

        for (String word : book) {
            if (word.trim().toLowerCase().equals(wordToFind)) count++;
        }

        return count;
    }

}
