package edu.sky.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    private ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    void reverse() {
        assertEquals(321, reverseInteger.reverse(123));
    }

    @Test
    void reverseNegative() {
        assertEquals(-123, reverseInteger.reverse(-321));
    }

    @Test
    void reverseLeadingZeros() {
        assertEquals(21, reverseInteger.reverse(1200));
    }

    @Test
    void reverseOverflowing() {
        assertEquals(0, reverseInteger.reverse(2147483647));
    }
}