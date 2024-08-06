package com.application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    public void testPalindromeIgnoreCase() {
        assertTrue(Palindrome.isPalindrome("Able was I ere I saw Elba"));
    }

    @Test
    public void testPalindromeWithPunctuation() {
        assertTrue(Palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeWithNumbers() {
        assertTrue(Palindrome.isPalindrome("12321"));
    }

    @Test
    public void testNullString() {
        assertTrue(Palindrome.isPalindrome(null));
    }
}