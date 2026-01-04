package basics.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тести для AdvancedMathTask1
 * Tests for AdvancedMathTask1
 */
public class AdvancedMathTask1Test {

    @Test
    public void testFactorial() {
        assertEquals(1, AdvancedMathTask1.factorial(0));
        assertEquals(1, AdvancedMathTask1.factorial(1));
        assertEquals(2, AdvancedMathTask1.factorial(2));
        assertEquals(6, AdvancedMathTask1.factorial(3));
        assertEquals(24, AdvancedMathTask1.factorial(4));
        assertEquals(120, AdvancedMathTask1.factorial(5));
        assertEquals(3628800, AdvancedMathTask1.factorial(10));

        assertThrows(IllegalArgumentException.class, () -> AdvancedMathTask1.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> AdvancedMathTask1.factorial(-5));
    }

    @Test
    public void testIsPrime() {
        assertFalse(AdvancedMathTask1.isPrime(-5));
        assertFalse(AdvancedMathTask1.isPrime(0));
        assertFalse(AdvancedMathTask1.isPrime(1));
        assertTrue(AdvancedMathTask1.isPrime(2));
        assertTrue(AdvancedMathTask1.isPrime(3));
        assertFalse(AdvancedMathTask1.isPrime(4));
        assertTrue(AdvancedMathTask1.isPrime(5));
        assertFalse(AdvancedMathTask1.isPrime(6));
        assertTrue(AdvancedMathTask1.isPrime(7));
        assertFalse(AdvancedMathTask1.isPrime(8));
        assertFalse(AdvancedMathTask1.isPrime(9));
        assertFalse(AdvancedMathTask1.isPrime(10));
        assertTrue(AdvancedMathTask1.isPrime(11));
        assertTrue(AdvancedMathTask1.isPrime(13));
        assertTrue(AdvancedMathTask1.isPrime(17));
        assertTrue(AdvancedMathTask1.isPrime(19));
        assertFalse(AdvancedMathTask1.isPrime(21));
        assertTrue(AdvancedMathTask1.isPrime(97));
        assertFalse(AdvancedMathTask1.isPrime(100));
    }

    @Test
    public void testGcd() {
        assertEquals(6, AdvancedMathTask1.gcd(12, 18));
        assertEquals(1, AdvancedMathTask1.gcd(7, 13));
        assertEquals(5, AdvancedMathTask1.gcd(15, 25));
        assertEquals(12, AdvancedMathTask1.gcd(12, 0));
        assertEquals(7, AdvancedMathTask1.gcd(0, 7));
        assertEquals(0, AdvancedMathTask1.gcd(0, 0));
        assertEquals(6, AdvancedMathTask1.gcd(-12, 18));
        assertEquals(6, AdvancedMathTask1.gcd(12, -18));
        assertEquals(6, AdvancedMathTask1.gcd(-12, -18));
        assertEquals(1, AdvancedMathTask1.gcd(1, 1));
    }

    @Test
    public void testLcm() {
        assertEquals(36, AdvancedMathTask1.lcm(12, 18));
        assertEquals(91, AdvancedMathTask1.lcm(7, 13));
        assertEquals(75, AdvancedMathTask1.lcm(15, 25));
        assertEquals(0, AdvancedMathTask1.lcm(12, 0));
        assertEquals(0, AdvancedMathTask1.lcm(0, 7));
        assertEquals(0, AdvancedMathTask1.lcm(0, 0));
        assertEquals(36, AdvancedMathTask1.lcm(-12, 18));
        assertEquals(36, AdvancedMathTask1.lcm(12, -18));
        assertEquals(1, AdvancedMathTask1.lcm(1, 1));
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, AdvancedMathTask1.fibonacci(0));
        assertEquals(1, AdvancedMathTask1.fibonacci(1));
        assertEquals(1, AdvancedMathTask1.fibonacci(2));
        assertEquals(2, AdvancedMathTask1.fibonacci(3));
        assertEquals(3, AdvancedMathTask1.fibonacci(4));
        assertEquals(5, AdvancedMathTask1.fibonacci(5));
        assertEquals(8, AdvancedMathTask1.fibonacci(6));
        assertEquals(13, AdvancedMathTask1.fibonacci(7));
        assertEquals(21, AdvancedMathTask1.fibonacci(8));
        assertEquals(55, AdvancedMathTask1.fibonacci(10));

        assertThrows(IllegalArgumentException.class, () -> AdvancedMathTask1.fibonacci(-1));
        assertThrows(IllegalArgumentException.class, () -> AdvancedMathTask1.fibonacci(-5));
    }

    @Test
    public void testIsPerfect() {
        assertFalse(AdvancedMathTask1.isPerfect(-6));
        assertFalse(AdvancedMathTask1.isPerfect(0));
        assertFalse(AdvancedMathTask1.isPerfect(1));
        assertFalse(AdvancedMathTask1.isPerfect(2));
        assertFalse(AdvancedMathTask1.isPerfect(5));
        assertTrue(AdvancedMathTask1.isPerfect(6)); // 6 = 1 + 2 + 3
        assertFalse(AdvancedMathTask1.isPerfect(12));
        assertTrue(AdvancedMathTask1.isPerfect(28)); // 28 = 1 + 2 + 4 + 7 + 14
        assertFalse(AdvancedMathTask1.isPerfect(30));
        assertFalse(AdvancedMathTask1.isPerfect(100));
        assertTrue(AdvancedMathTask1.isPerfect(496)); // Third perfect number
    }

    @Test
    public void testReverseDigits() {
        assertEquals(321, AdvancedMathTask1.reverseDigits(123));
        assertEquals(1, AdvancedMathTask1.reverseDigits(1));
        assertEquals(0, AdvancedMathTask1.reverseDigits(0));
        assertEquals(54321, AdvancedMathTask1.reverseDigits(12345));
        assertEquals(-321, AdvancedMathTask1.reverseDigits(-123));
        assertEquals(1, AdvancedMathTask1.reverseDigits(100));
        assertEquals(21, AdvancedMathTask1.reverseDigits(120));
    }

    @Test
    public void testCountDigits() {
        assertEquals(3, AdvancedMathTask1.countDigits(123));
        assertEquals(1, AdvancedMathTask1.countDigits(1));
        assertEquals(1, AdvancedMathTask1.countDigits(0));
        assertEquals(5, AdvancedMathTask1.countDigits(12345));
        assertEquals(3, AdvancedMathTask1.countDigits(-123));
        assertEquals(3, AdvancedMathTask1.countDigits(100));
        assertEquals(4, AdvancedMathTask1.countDigits(1000));
        assertEquals(1, AdvancedMathTask1.countDigits(9));
        assertEquals(2, AdvancedMathTask1.countDigits(10));
    }

    @Test
    public void testSumOfDigits() {
        assertEquals(6, AdvancedMathTask1.sumOfDigits(123));
        assertEquals(1, AdvancedMathTask1.sumOfDigits(1));
        assertEquals(0, AdvancedMathTask1.sumOfDigits(0));
        assertEquals(15, AdvancedMathTask1.sumOfDigits(12345));
        assertEquals(6, AdvancedMathTask1.sumOfDigits(-123));
        assertEquals(1, AdvancedMathTask1.sumOfDigits(100));
        assertEquals(45, AdvancedMathTask1.sumOfDigits(123456789));
        assertEquals(9, AdvancedMathTask1.sumOfDigits(90));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(AdvancedMathTask1.isPalindrome(121));
        assertTrue(AdvancedMathTask1.isPalindrome(1));
        assertTrue(AdvancedMathTask1.isPalindrome(0));
        assertTrue(AdvancedMathTask1.isPalindrome(12321));
        assertFalse(AdvancedMathTask1.isPalindrome(123));
        assertFalse(AdvancedMathTask1.isPalindrome(12));
        assertTrue(AdvancedMathTask1.isPalindrome(1221));
        assertTrue(AdvancedMathTask1.isPalindrome(9009));
        assertTrue(AdvancedMathTask1.isPalindrome(-121));
    }

    @Test
    public void testSieveOfEratosthenes() {
        assertArrayEquals(new int[]{}, AdvancedMathTask1.sieveOfEratosthenes(1));
        assertArrayEquals(new int[]{2}, AdvancedMathTask1.sieveOfEratosthenes(2));
        assertArrayEquals(new int[]{2, 3}, AdvancedMathTask1.sieveOfEratosthenes(3));
        assertArrayEquals(new int[]{2, 3, 5}, AdvancedMathTask1.sieveOfEratosthenes(5));
        assertArrayEquals(new int[]{2, 3, 5, 7}, AdvancedMathTask1.sieveOfEratosthenes(10));
        assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13, 17, 19}, AdvancedMathTask1.sieveOfEratosthenes(20));
        assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29}, AdvancedMathTask1.sieveOfEratosthenes(30));
        assertArrayEquals(new int[]{}, AdvancedMathTask1.sieveOfEratosthenes(0));
        assertArrayEquals(new int[]{}, AdvancedMathTask1.sieveOfEratosthenes(-5));
    }

    @Test
    public void testLargestDigit() {
        assertEquals(3, AdvancedMathTask1.largestDigit(123));
        assertEquals(1, AdvancedMathTask1.largestDigit(1));
        assertEquals(0, AdvancedMathTask1.largestDigit(0));
        assertEquals(9, AdvancedMathTask1.largestDigit(12945));
        assertEquals(3, AdvancedMathTask1.largestDigit(-123));
        assertEquals(1, AdvancedMathTask1.largestDigit(100));
        assertEquals(9, AdvancedMathTask1.largestDigit(987654321));
        assertEquals(5, AdvancedMathTask1.largestDigit(15234));
        assertEquals(7, AdvancedMathTask1.largestDigit(70001));
    }
}