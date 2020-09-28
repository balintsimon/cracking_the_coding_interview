package com.ctci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HopsTest {
    Hops hops = new Hops();

    @Test
    public void testForOneStair() {
        int actualResult = hops.countHowManyWaysToHop(1);
        int expectedResult = 1;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testForTwoStair() {
        int actualResult = hops.countHowManyWaysToHop(2);
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testForThreeStair() {
        int actualResult = hops.countHowManyWaysToHop(3);
        int expectedResult = 4;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testForFourStair() {
        int actualResult = hops.countHowManyWaysToHop(4);
        int expectedResult = 7;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}