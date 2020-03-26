package edu.sky.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] ints = {2, 7, 11, 15};
        int[] sum = twoSum.twoSum(ints, 9);
        int[] expected = {0, 1};
        assertArrayEquals(expected, sum);
    }
}