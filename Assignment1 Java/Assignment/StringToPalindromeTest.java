package Assignment_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToPalindromeTest {
    @Test
    void testStringToPalindrome() {
        assertTrue(StringToPalindrome.isPalindrome("Kayak"));
        assertTrue(StringToPalindrome.isPalindrome("level"));
        assertFalse(StringToPalindrome.isPalindrome("dad"));
        assertFalse(StringToPalindrome.isPalindrome("Refer"));
    }

}