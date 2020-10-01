package com.codecool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapperTest {
    Swapper swapper;

    private void generalTestForSwappingValues(int original1st, int original2nd) {
        swapper = new Swapper(original1st, original2nd);
        assertEquals(swapper.getNumberA(), original1st);
        assertEquals(swapper.getNumberB(), original2nd);

        swapper.swapNumbers();

        assertEquals(swapper.getNumberA(), original2nd);
        assertEquals(swapper.getNumberB(), original1st);
    }

    @Test
    public void testPositive() {
        int original1st = 1;
        int original2nd = 2;

        generalTestForSwappingValues(original1st, original2nd);
    }


    @Test
    public void testOneNegative() {
        int original1st = -1;
        int original2nd = 2;

        generalTestForSwappingValues(original1st, original2nd);
    }

    @Test
    public void testNegative() {
        int original1st = -1;
        int original2nd = -2;

        generalTestForSwappingValues(original1st, original2nd);
    }

    @Test
    public void testLarge() {
        int original1st = 100000;
        int original2nd = -2000;

        generalTestForSwappingValues(original1st, original2nd);
    }

    @Test
    public void testZeroAndLarge() {
        int original1st = 100000;
        int original2nd = 0;

        generalTestForSwappingValues(original1st, original2nd);
    }

    @Test
    public void testZeroAndNegative() {
        int original1st = 0;
        int original2nd = -1000000;

        generalTestForSwappingValues(original1st, original2nd);
    }

    @Test
    public void testEqualValues() {
        int original1st = 100;
        int original2nd = 100;

        generalTestForSwappingValues(original1st, original2nd);
    }
}