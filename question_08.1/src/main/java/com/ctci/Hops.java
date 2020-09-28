package com.ctci;

/* Question 8.1. - Triple Step
* A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a
* method to count how many possible ways the child can run up the stairs.
* */

/* Notes
* The book puts forward memoization as a solution to saving memory with recursion.
*
* Return value for 0 steps is a question. Let's use 1, because this way we can calculate the return value for
* steps-1 easily.
* */

import java.util.Arrays;

public class Hops {

    public int countHowManyWaysToHop(int numberOfStairs) {
        int[] waysOfStepsMemoization = new int [numberOfStairs + 1];
        Arrays.fill(waysOfStepsMemoization, -1); // Use non-return value as placeholder instead of 0
        return countHowManyWaysToHop(numberOfStairs, waysOfStepsMemoization);
    }

    public int countHowManyWaysToHop(int stairNumber, int[] stepContainer) {
        if (stairNumber < 0) { // Base case.
            return 0;
        } else if (stairNumber == 0) {
            return 1; // See notes.
        } else if (stepContainer[stairNumber] > -1) { // As we filled the array with -1, if we
                                                      // get a different value we just return it
                                                      // as we have already calculated that.
            return stepContainer[stairNumber];
        } else {
            stepContainer[stairNumber] =
                    countHowManyWaysToHop(stairNumber - 1, stepContainer) +
                    countHowManyWaysToHop(stairNumber - 2, stepContainer) +
                    countHowManyWaysToHop(stairNumber - 3, stepContainer);
            return stepContainer[stairNumber];
        }
    }

    public static void main(String[] args) {
        System.out.println("See and run tests.");
    }
}
