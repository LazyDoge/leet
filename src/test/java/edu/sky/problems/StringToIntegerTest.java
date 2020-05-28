package edu.sky.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {
    private StringToInteger stringToInteger = new StringToInteger();

    @Test
    void test() {
        assertEquals(-3, stringToInteger.myAtoi("-3.243"));
    }

    @Test
    void test2() {
        assertEquals(1, stringToInteger.myAtoi("+1"));
    }

    @Test
    void test3() {
        assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi("20000000000000000000"));
    }


}