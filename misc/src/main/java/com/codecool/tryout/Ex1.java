package com.codecool.tryout;

public class Ex1 {
    public static int arraySum(List<Integer> numbers) {
        Integer sum = numbers.stream()
                .reduce(0, Integer::sum);
        return sum;
    }
}
