package edu.sky.problems;

import java.util.HashSet;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (set.contains(chars[j])) {
                    if (max < set.size()) {
                        max = set.size();
                    }
                    set.clear();
                    break;
                }
                set.add(chars[j]);
                if (j == chars.length - 1) {
                    i = j;
                }
            }
        }
        if (set.size() > max) {
            max = set.size();
        }
        return max;

    }
}