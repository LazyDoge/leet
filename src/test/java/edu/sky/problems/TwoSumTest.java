package edu.sky.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum twoSum = new TwoSum();



    @Test
    void twoSum() {
        checkTwoSum(new int[] {2, 7, 11, 15}, 9, new int[]{0,1});
    }


//[0,4,3,0]
//0
    @Test
    void twoSum2() {
        checkTwoSum(new int[] {0, 4, 3, 0}, 0, new int[]{0,3});
    }

//    [-3,4,3,90]
//0
    @Test
    void twoSum3() {
        checkTwoSum(new int[] {-3, 4, 3, 90}, 0, new  int[] {0,2});

    }


//    [3,2,4]
//            6
    @Test
    void twoSum4() {
        checkTwoSum(new int[] {3,2,4}, 6, new int[] {1,2});
    }

    private void checkTwoSum(int[] array, int target, int[] expected) {
        int[] sum = twoSum.twoSum(array, target);
        assertArrayEquals(expected, sum);
    }
}