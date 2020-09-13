package com.codecool.tryout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTryout {

    private int[] squareDigits(int[] numbers) {
        return Arrays.stream(numbers)
                .map(i -> i * i)
                .toArray();
    }

    private List<Integer> squareDigits(List<Integer> numbers) {
        return numbers.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
    }

    private void toAllUppercase(String inputString) {
        Stream.of(inputString)
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
    }

    private List<String> splitStringToWords(String inputString) {
        return Stream.of(inputString.split(" "))
                .map(s -> new String(s))
                .collect(Collectors.toList());
    }

    private List<Character> splitStringToChars(String inputString) {
        return inputString.chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toList());
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int maxSize = arr.size();
        int firstDiagSum = 0;
        int secondDiagSum = 0;
        for (int position = 0; position < maxSize; position++) {
            firstDiagSum += arr.get(position).get(position);
            secondDiagSum += arr.get(maxSize - position - 1).get(position);
        }

        return Math.abs(firstDiagSum - secondDiagSum);
    }

    public static String[] split(final String joint) {
        if (joint.length() == 0) return new String[] {""};
        return joint.split("\\.");
    }

    public static void main(String[] args) {
        StreamTryout streamTryout = new StreamTryout();
        int[] numbers = new int[]{1, 3, 5, 6, 11, 125, 2};
        int[] squares = streamTryout.squareDigits(numbers);
        Arrays.stream(squares).forEach(i -> System.out.println(i));

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(11);
        numbers2.add(125);
        numbers2.add(2);
        List<Integer> squareNumbers2 = streamTryout.squareDigits(numbers2);
        squareNumbers2.stream().forEach(integer -> System.out.println(integer));

        String tryout = "This is a tryout that should go uppercase!";
        streamTryout.toAllUppercase(tryout);
        streamTryout.splitStringToWords(tryout).stream().forEach(s -> System.out.println(s));
        streamTryout.splitStringToChars("wOrDs").stream().forEach(character -> System.out.println(character));
    }
}
