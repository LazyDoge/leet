package edu.sky.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    @Test
    void findMedianSortedArrays() {
        MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();
        int[] shorter = new int[]{1,6,7};
        int[] longer = new int[]{2,3,4,5,8,9};

        double medianSortedArrays = median.findMedianSortedArrays(shorter, longer);
        assertEquals(5, medianSortedArrays);

    }
}