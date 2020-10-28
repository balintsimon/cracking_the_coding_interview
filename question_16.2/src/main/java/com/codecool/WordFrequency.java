package com.codecool;

/* Question 16.2. - Word Frequencies
* Design a method to find the frequency of occurrences of any given word in a book.
* What if we were running this algorithm multiple times?
* */

/* Notes
* */

import java.util.HashMap;

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

    // What if we were running this algorithm multiple times?

    public HashMap<String, Integer> setupBookDictionary(String[] book) {
        HashMap<String, Integer> bookWords = new HashMap<>();
        for (String word : book) {
            word = word.trim().toLowerCase();
            if (!bookWords.containsKey(word)) {
                bookWords.put(word, 1);
            } else {
                bookWords.put(word, bookWords.get(word) + 1);
            }
        }
        return bookWords;
    }

    public int getWordFrequencyMultipleTimes(HashMap<String, Integer> bookWords, String wordToFind) {
        if (bookWords == null || wordToFind == null) return -1;
        wordToFind = wordToFind.trim().toLowerCase();
        if (bookWords.containsKey(wordToFind)) return bookWords.get(wordToFind);
        return 0;
    }

}
