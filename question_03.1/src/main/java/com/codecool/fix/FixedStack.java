package com.codecool.fix;

import java.util.EmptyStackException;

public class FixedStack {
    private final int NUMBER_OF_STACKS = 3;
    private int stackCapacity;
    private int[] values;
    private int[] actualSizes;


    public FixedStack(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        this.values = new int[stackCapacity * NUMBER_OF_STACKS];
        this.actualSizes = new int[stackCapacity];
    }

    public void push(int stackNumber, int valueToAdd) throws IndexOutOfBoundsException {
        if (actualSizes[stackNumber] == stackCapacity) {
            throw new IndexOutOfBoundsException();
        }

        actualSizes[stackNumber]++;
        values[indexOfLastValue(stackNumber)] = valueToAdd;
    }

    public int pop(int stackNumber) throws EmptyStackException {
        if (isEmpty(stackNumber)) {
            throw new EmptyStackException();
        }

        int indexOfTop = indexOfLastValue(stackNumber);
        int valueToPop = values[indexOfTop];
        values[indexOfTop] = 0;
        actualSizes[stackNumber]--;
        return valueToPop;
    }

    public int peek(int stackNumber) throws EmptyStackException {
        if (isEmpty(stackNumber)) {
            throw new EmptyStackException();
        }
        return values[indexOfLastValue(stackNumber)];
    }


    public boolean isEmpty(int stackNumber) {
        return actualSizes[stackNumber] == 0;
    }

    private int indexOfLastValue(int stackNumber) {
        int startOfStack = stackNumber * stackCapacity;
        int top = actualSizes[stackNumber];
        return startOfStack + top - 1;
    }

}
