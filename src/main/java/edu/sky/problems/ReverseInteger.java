package edu.sky.problems;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {
    public int reverse(int x) {
        long longX = (long) x;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            longX *= -1;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(longX)).reverse();
        long l = Long.parseLong(sb.toString());
        if (isNegative) {
            l *= -1;
        }

        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) l;
        }
    }
}
