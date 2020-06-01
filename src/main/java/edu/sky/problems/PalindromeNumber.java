package edu.sky.problems;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
