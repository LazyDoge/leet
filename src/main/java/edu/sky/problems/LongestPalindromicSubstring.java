package edu.sky.problems;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * <p>
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindromicSubstring {
    public static int max = 1;
    public static int start = 0;
    public static int end = 1;
    public static char[] chars;


    public String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return "";
        }

        evict(s);

        for (int i = 0; i < chars.length; i++) {
            tryFindLongestSubstring(i);
        }

        return s.substring(start, end);
    }

    private void evict(String s) {
        max = 1;
        start = 0;
        end = 1;
        chars = s.toCharArray();
    }

    private void tryFindLongestSubstring(int i) {
        int localMax = 1;

        if (i + 1 != chars.length) {
            if (chars[i] == chars[i + 1]) {
                lookupForMax(localMax + 1, i, i + 1);
            }
            lookupForMax(localMax, i, i);
        }


    }

    private void lookupForMax(int localMax, int down, int up) {
        down--;
        up++;
        boolean tryNext = true;
        while (down >= 0 && up < chars.length && tryNext) {
            if (chars[up] == chars[down]) {
                down--;
                up++;
                localMax += 2;
            } else {
                tryNext = false;

            }

        }
        if (localMax > max) {
            max = localMax;
            start = ++down;
            end = up;
        }
    }
}
