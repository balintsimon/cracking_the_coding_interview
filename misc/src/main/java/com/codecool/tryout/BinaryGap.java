package com.codecool.tryout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryGap {

    public int binaryGapCounter(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        int tmpCount = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                if (i > 0 && binary.charAt(i - 1) == '1') {
                    tmpCount++;
                } else {
                    if (tmpCount > 0) tmpCount++;
                }
            } else if (binary.charAt(i) == '1') {
                if (tmpCount > 0 && tmpCount > count) {
                    count = tmpCount;
                }
                tmpCount = 0;
            }
        }
        return count;
//        n >>>= Integer.numberOfTrailingZeros(n);
//        int steps = 0;
//        while ((n & (n + 1)) != 0) {
//            n |= n >>> 1;
//            steps++;
//        }
//        return steps;
    }

    private String pigIt(String str) {
        String[] words = str.split(" ");
        String[] latind = words;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.matches("[A-Za-z0-9]+")) {
                latind[i] = word;
            } else {
                latind[i] = word.substring(1)
                        + word.charAt(0)
                        + "ay";
            }
        }
        return String.join(" ", latind);
    }

    static long lights(int n) {
        double sqrtOf5 = Math.sqrt(5);
        double Phi = (1 + sqrtOf5) / 2;
        double phi = Phi - 1;
//        return (long) ((Math.pow(Phi, n) - Math.pow(phi, n)) / sqrtOf5);
        return (long) Math.floor(Math.pow((1+Math.sqrt(5))/2, n) / Math.sqrt(5) + 0.5);

        /*
         * Write your code here.
         */

    }

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();

        System.out.println(binaryGap.binaryGapCounter(1041));
        System.out.println(binaryGap.binaryGapCounter(32));

        char separator = 0x20;
        int message = 1;
        System.out.println(separator+message+"=A");
    }

    public int oddOccurencesInArray(int[] A) {
        if (A.length == 1) return A[0];
        if (A == null) return 0;
        Map<Integer, Boolean> values = new HashMap<>();

        for (int value : A) {
            if (values.containsKey(value)) {
                Boolean currentValue = values.get(value);
                values.put(value, !currentValue);
            } else {
                values.put(value, Boolean.FALSE);
            }
        }

        for (Map.Entry entry : values.entrySet()) {
            if (entry.getValue() == Boolean.FALSE) return (int) entry.getKey();
        }
        return 0;
    }

//    public void solution() throws java.math.MathException(Div){

//    }
}
