package edu.sky.problems;


/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 *
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 0 || numRows == 1) {
            return s;
        }

        //TODO instead of using 2 dimensional array can be used array of strings
        char[][] chars = new char[numRows][s.length()];
        int x = 0;
        int y = 0;
        char[] charArray = s.toCharArray();
        for (int j = 0; j < charArray.length;) {
            for (int i = 0; i < numRows; i++) {
                if (j >= charArray.length) {
                    break;
                }
                chars[y + i][x] = charArray[j++];
            }
            y = numRows - 2;
            for (; y > 0; y--) {
                if (j >= charArray.length) {
                    break;
                }
                chars[y][++x] = charArray[j++];
            }
            x++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char[] aChar : chars) {
            stringBuilder.append(new String(aChar).replace('\0', '?').replace("?", ""));
        }
        return stringBuilder.toString();
    }
}
