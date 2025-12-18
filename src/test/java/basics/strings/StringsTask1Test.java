package basics.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тести для StringsTask1
 * Tests for StringsTask1
 */
public class StringsTask1Test {

    @Test
    public void testGetLength() {
        assertEquals(5, StringsTask1.getLength("hello"));
        assertEquals(0, StringsTask1.getLength(""));
        assertEquals(0, StringsTask1.getLength(null));
        assertEquals(13, StringsTask1.getLength("Hello, World!"));
        assertEquals(1, StringsTask1.getLength("a"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringsTask1.isPalindrome("racecar"));
        assertTrue(StringsTask1.isPalindrome("A man a plan a canal Panama"));
        assertFalse(StringsTask1.isPalindrome("race a car")); // This is NOT a palindrome
        assertTrue(StringsTask1.isPalindrome(""));
        assertTrue(StringsTask1.isPalindrome(null));
        assertTrue(StringsTask1.isPalindrome("a"));
        assertTrue(StringsTask1.isPalindrome("Aa"));
        assertFalse(StringsTask1.isPalindrome("hello"));
        assertFalse(StringsTask1.isPalindrome("race a dog"));
        // Test with Ukrainian text
        assertFalse(StringsTask1.isPalindrome("козак за козак")); // This is NOT a palindrome
    }

    @Test
    public void testCountVowels() {
        assertEquals(2, StringsTask1.countVowels("hello"));
        assertEquals(5, StringsTask1.countVowels("beautiful"));
        assertEquals(0, StringsTask1.countVowels("xyz"));
        assertEquals(0, StringsTask1.countVowels(""));
        assertEquals(0, StringsTask1.countVowels(null));
        assertEquals(1, StringsTask1.countVowels("a"));
        assertEquals(5, StringsTask1.countVowels("aeiou"));
        // Test with Ukrainian vowels
        assertEquals(2, StringsTask1.countVowels("привіт"));
        assertEquals(4, StringsTask1.countVowels("Україна"));
    }

    @Test
    public void testCountConsonants() {
        assertEquals(3, StringsTask1.countConsonants("hello"));
        assertEquals(4, StringsTask1.countConsonants("beautiful"));
        assertEquals(3, StringsTask1.countConsonants("xyz"));
        assertEquals(0, StringsTask1.countConsonants(""));
        assertEquals(0, StringsTask1.countConsonants(null));
        assertEquals(0, StringsTask1.countConsonants("aeiou"));
        assertEquals(1, StringsTask1.countConsonants("b"));
        assertEquals(0, StringsTask1.countConsonants("123"));
        // Test with Ukrainian consonants
        assertEquals(4, StringsTask1.countConsonants("привіт"));
        assertEquals(3, StringsTask1.countConsonants("Україна"));
    }

    @Test
    public void testReverse() {
        assertEquals("olleh", StringsTask1.reverse("hello"));
        assertEquals("", StringsTask1.reverse(""));
        assertNull(StringsTask1.reverse(null));
        assertEquals("a", StringsTask1.reverse("a"));
        assertEquals("!dlroW ,olleH", StringsTask1.reverse("Hello, World!"));
        assertEquals("54321", StringsTask1.reverse("12345"));
    }

    @Test
    public void testCountWords() {
        assertEquals(2, StringsTask1.countWords("hello world"));
        assertEquals(1, StringsTask1.countWords("hello"));
        assertEquals(0, StringsTask1.countWords(""));
        assertEquals(0, StringsTask1.countWords(null));
        assertEquals(0, StringsTask1.countWords("   "));
        assertEquals(3, StringsTask1.countWords("  hello   world   java  "));
        assertEquals(5, StringsTask1.countWords("This is a test string"));
        assertEquals(1, StringsTask1.countWords("SingleWord"));
    }

    @Test
    public void testIsNumeric() {
        assertTrue(StringsTask1.isNumeric("123"));
        assertTrue(StringsTask1.isNumeric("0"));
        assertTrue(StringsTask1.isNumeric("987654321"));
        assertFalse(StringsTask1.isNumeric("12.3"));
        assertFalse(StringsTask1.isNumeric("12a"));
        assertFalse(StringsTask1.isNumeric("hello"));
        assertFalse(StringsTask1.isNumeric(""));
        assertFalse(StringsTask1.isNumeric(null));
        assertFalse(StringsTask1.isNumeric("-123"));
        assertFalse(StringsTask1.isNumeric("12 3"));
    }

    @Test
    public void testCapitalize() {
        assertEquals("Hello World", StringsTask1.capitalize("hello world"));
        assertEquals("Java Programming", StringsTask1.capitalize("JAVA PROGRAMMING"));
        assertEquals("This Is A Test", StringsTask1.capitalize("this is a test"));
        assertEquals("", StringsTask1.capitalize(""));
        assertNull(StringsTask1.capitalize(null));
        assertEquals("A", StringsTask1.capitalize("a"));
        assertEquals("Hello", StringsTask1.capitalize("hello"));
        assertEquals(" Hello World", StringsTask1.capitalize("  hello  world  "));
    }

    @Test
    public void testCountOccurrences() {
        assertEquals(2, StringsTask1.countOccurrences("hello world hello", "hello"));
        assertEquals(2, StringsTask1.countOccurrences("aaabaaac", "aa"));
        assertEquals(0, StringsTask1.countOccurrences("hello world", "xyz"));
        assertEquals(0, StringsTask1.countOccurrences("hello", ""));
        assertEquals(0, StringsTask1.countOccurrences(null, "hello"));
        assertEquals(0, StringsTask1.countOccurrences("hello", null));
        assertEquals(1, StringsTask1.countOccurrences("hello", "hello"));
        assertEquals(2, StringsTask1.countOccurrences("hello", "l"));
    }

    @Test
    public void testRemoveSpaces() {
        assertEquals("helloworld", StringsTask1.removeSpaces("hello world"));
        assertEquals("", StringsTask1.removeSpaces("   "));
        assertEquals("", StringsTask1.removeSpaces(""));
        assertNull(StringsTask1.removeSpaces(null));
        assertEquals("abc", StringsTask1.removeSpaces("a b c"));
        assertEquals("HelloWorld!", StringsTask1.removeSpaces("Hello World!"));
        assertEquals("test123", StringsTask1.removeSpaces("  test  123  "));
        assertEquals("notabs", StringsTask1.removeSpaces("no\ttabs"));
        assertEquals("nonewlines", StringsTask1.removeSpaces("no\nnewlines"));
    }
}