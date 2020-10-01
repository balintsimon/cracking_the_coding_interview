package com.codecool;

/* Question 16.1. - Number Swapper
* Write a function to swap two numbers in place (that is, without temporary variables).
* */

/* Notes
* Both solutions work on using the same variables, but the first step stores either their difference (subtraction first)
* or their compound value (addition first). Then it calculates the second value based on the diff/compound and finally
* gets the other value by using the diff/compound and the swapped value to recalculate the other original value.
* */

public class Swapper {
    private int numberA;
    private int numberB;

    public Swapper(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public int getNumberA() {
        return numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void swapNumbers() {
        if (numberA != numberB) {
            // With subtraction first
    //        numberA = numberA - numberB;
    //        numberB = numberA + numberB;
    //        numberA = numberB - numberA;

            // With addition first
            numberA = numberA + numberB;
            numberB = numberA - numberB;
            numberA = numberA - numberB;
        }
    }
}
