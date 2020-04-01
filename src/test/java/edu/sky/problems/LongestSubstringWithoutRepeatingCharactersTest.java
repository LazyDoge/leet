package edu.sky.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters testedClass = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(2, testedClass.lengthOfLongestSubstring("aab"));
        assertEquals(3, testedClass.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, testedClass.lengthOfLongestSubstring("bbbbb"));
        assertEquals(6, testedClass.lengthOfLongestSubstring("pwwkewbnm"));
        assertEquals(3, testedClass.lengthOfLongestSubstring("pwwkew"));
    }
}