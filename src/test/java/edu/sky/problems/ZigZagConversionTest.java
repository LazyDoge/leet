package edu.sky.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {

    @Test
    void convert() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = zigZagConversion.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", s);
        assertEquals("PAHNAPLSIIGYIR", zigZagConversion.convert("PAYPALISHIRING", 3));
    }

    @Test
    void convertZeroNumRows() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = zigZagConversion.convert("PAYPALISHIRING", 0);
        assertEquals("PAYPALISHIRING", s);
    }

    @Test
    void convertLongNumRows() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = zigZagConversion.convert("PAYPALISHIRING", 100);
        assertEquals("PAYPALISHIRING", s);
    }

    @Test
    void convertEmptyString() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = zigZagConversion.convert("", 3);
        assertEquals("", s);
    }

    @Test
    void convertLeetTest1() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = zigZagConversion.convert("AB", 1);
        assertEquals("AB", s);
    }

}