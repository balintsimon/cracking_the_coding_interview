package com.codecool.tryout;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex2 {
    public static int countDuplicate(List<Integer> numbers) {
        //Map values => iterate over list once (O(n)) + once over Map to get keys with value larger then 1 + needs counter
        //Set size => iterate over list once (O(n)) + get size of set
        // both uses separate containers, so space complexity is rubbish...
        // Set solution seems faster

        Set<Integer> intermediaryStorage = new HashSet<>();
        Set<Integer> results = numbers.stream()
                // Set<> .add() returns boolean (true if new element added, false otherwise)
                .filter(number -> !intermediaryStorage.add(number))
                .collect(Collectors.toSet());

        return results.size();
    }
}
