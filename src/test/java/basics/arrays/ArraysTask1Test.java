package basics.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тести для ArraysTask1
 * Tests for ArraysTask1
 */
public class ArraysTask1Test {

    @Test
    public void testSum() {
        assertEquals(15, ArraysTask1.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, ArraysTask1.sum(new int[]{}));
        assertEquals(0, ArraysTask1.sum(null));
        assertEquals(10, ArraysTask1.sum(new int[]{10}));
        assertEquals(-5, ArraysTask1.sum(new int[]{-2, -3}));
        assertEquals(0, ArraysTask1.sum(new int[]{-5, 5}));
    }

    @Test
    public void testAverage() {
        assertEquals(3.0, ArraysTask1.average(new int[]{1, 2, 3, 4, 5}), 0.001);
        assertEquals(0.0, ArraysTask1.average(new int[]{}), 0.001);
        assertEquals(0.0, ArraysTask1.average(null), 0.001);
        assertEquals(10.0, ArraysTask1.average(new int[]{10}), 0.001);
        assertEquals(-2.5, ArraysTask1.average(new int[]{-2, -3}), 0.001);
        assertEquals(2.5, ArraysTask1.average(new int[]{1, 2, 3, 4}), 0.001);
    }

    @Test
    public void testFindMax() {
        assertEquals(5, ArraysTask1.findMax(new int[]{1, 2, 3, 4, 5}));
        assertEquals(10, ArraysTask1.findMax(new int[]{10}));
        assertEquals(5, ArraysTask1.findMax(new int[]{5, 2, 3, 1, 4}));
        assertEquals(-1, ArraysTask1.findMax(new int[]{-5, -2, -3, -1, -4}));
        assertEquals(0, ArraysTask1.findMax(new int[]{-5, 0, -3}));

        assertThrows(IllegalArgumentException.class, () -> ArraysTask1.findMax(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> ArraysTask1.findMax(null));
    }

    @Test
    public void testFindMin() {
        assertEquals(1, ArraysTask1.findMin(new int[]{1, 2, 3, 4, 5}));
        assertEquals(10, ArraysTask1.findMin(new int[]{10}));
        assertEquals(1, ArraysTask1.findMin(new int[]{5, 2, 3, 1, 4}));
        assertEquals(-5, ArraysTask1.findMin(new int[]{-5, -2, -3, -1, -4}));
        assertEquals(-5, ArraysTask1.findMin(new int[]{-5, 0, -3}));

        assertThrows(IllegalArgumentException.class, () -> ArraysTask1.findMin(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> ArraysTask1.findMin(null));
    }

    @Test
    public void testFindFirst() {
        assertEquals(2, ArraysTask1.findFirst(new int[]{1, 2, 3, 4, 5}, 3));
        assertEquals(-1, ArraysTask1.findFirst(new int[]{1, 2, 3, 4, 5}, 6));
        assertEquals(0, ArraysTask1.findFirst(new int[]{5, 2, 3, 1, 4}, 5));
        assertEquals(-1, ArraysTask1.findFirst(new int[]{}, 1));
        assertEquals(-1, ArraysTask1.findFirst(null, 1));
        assertEquals(1, ArraysTask1.findFirst(new int[]{1, 3, 2, 3, 4}, 3));
    }

    @Test
    public void testFindLast() {
        assertEquals(2, ArraysTask1.findLast(new int[]{1, 2, 3, 4, 5}, 3));
        assertEquals(-1, ArraysTask1.findLast(new int[]{1, 2, 3, 4, 5}, 6));
        assertEquals(0, ArraysTask1.findLast(new int[]{5, 2, 3, 1, 4}, 5));
        assertEquals(-1, ArraysTask1.findLast(new int[]{}, 1));
        assertEquals(-1, ArraysTask1.findLast(null, 1));
        assertEquals(3, ArraysTask1.findLast(new int[]{1, 3, 2, 3, 4}, 3));
    }

    @Test
    public void testCount() {
        assertEquals(1, ArraysTask1.count(new int[]{1, 2, 3, 4, 5}, 3));
        assertEquals(0, ArraysTask1.count(new int[]{1, 2, 3, 4, 5}, 6));
        assertEquals(2, ArraysTask1.count(new int[]{1, 3, 2, 3, 4}, 3));
        assertEquals(0, ArraysTask1.count(new int[]{}, 1));
        assertEquals(0, ArraysTask1.count(null, 1));
        assertEquals(5, ArraysTask1.count(new int[]{1, 1, 1, 1, 1}, 1));
    }

    @Test
    public void testReverse() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArraysTask1.reverse(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{}, ArraysTask1.reverse(new int[]{}));
        assertNull(ArraysTask1.reverse(null));
        assertArrayEquals(new int[]{10}, ArraysTask1.reverse(new int[]{10}));
        assertArrayEquals(new int[]{2, 1}, ArraysTask1.reverse(new int[]{1, 2}));
    }

    @Test
    public void testIsSortedAscending() {
        assertTrue(ArraysTask1.isSortedAscending(new int[]{1, 2, 3, 4, 5}));
        assertTrue(ArraysTask1.isSortedAscending(new int[]{1, 1, 2, 2, 3}));
        assertFalse(ArraysTask1.isSortedAscending(new int[]{1, 3, 2, 4, 5}));
        assertTrue(ArraysTask1.isSortedAscending(new int[]{}));
        assertTrue(ArraysTask1.isSortedAscending(new int[]{5}));
        assertTrue(ArraysTask1.isSortedAscending(null));
        assertFalse(ArraysTask1.isSortedAscending(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void testIsSortedDescending() {
        assertTrue(ArraysTask1.isSortedDescending(new int[]{5, 4, 3, 2, 1}));
        assertTrue(ArraysTask1.isSortedDescending(new int[]{3, 2, 2, 1, 1}));
        assertFalse(ArraysTask1.isSortedDescending(new int[]{5, 4, 6, 2, 1}));
        assertTrue(ArraysTask1.isSortedDescending(new int[]{}));
        assertTrue(ArraysTask1.isSortedDescending(new int[]{5}));
        assertTrue(ArraysTask1.isSortedDescending(null));
        assertFalse(ArraysTask1.isSortedDescending(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testFindSecondMax() {
        assertEquals(4, ArraysTask1.findSecondMax(new int[]{1, 2, 3, 4, 5}));
        assertEquals(8, ArraysTask1.findSecondMax(new int[]{10, 8, 6, 4, 2}));
        assertEquals(5, ArraysTask1.findSecondMax(new int[]{10, 5, 10, 3, 5}));
        assertEquals(2, ArraysTask1.findSecondMax(new int[]{3, 2}));

        assertThrows(IllegalArgumentException.class, () -> ArraysTask1.findSecondMax(new int[]{5}));
        assertThrows(IllegalArgumentException.class, () -> ArraysTask1.findSecondMax(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> ArraysTask1.findSecondMax(null));
        assertThrows(IllegalArgumentException.class, () -> ArraysTask1.findSecondMax(new int[]{5, 5, 5}));
    }

    @Test
    public void testHasDuplicates() {
        assertTrue(ArraysTask1.hasDuplicates(new int[]{1, 2, 3, 2, 4}));
        assertTrue(ArraysTask1.hasDuplicates(new int[]{1, 1}));
        assertFalse(ArraysTask1.hasDuplicates(new int[]{1, 2, 3, 4, 5}));
        assertFalse(ArraysTask1.hasDuplicates(new int[]{}));
        assertFalse(ArraysTask1.hasDuplicates(new int[]{5}));
        assertFalse(ArraysTask1.hasDuplicates(null));
        assertTrue(ArraysTask1.hasDuplicates(new int[]{1, 2, 3, 4, 1}));
    }

    @Test
    public void testRemoveElement() {
        assertArrayEquals(new int[]{1, 2, 4, 5}, ArraysTask1.removeElement(new int[]{1, 2, 3, 4, 5}, 3));
        assertArrayEquals(new int[]{2, 4}, ArraysTask1.removeElement(new int[]{1, 2, 3, 4, 3}, 3));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArraysTask1.removeElement(new int[]{1, 2, 3, 4, 5}, 6));
        assertArrayEquals(new int[]{}, ArraysTask1.removeElement(new int[]{}, 1));
        assertNull(ArraysTask1.removeElement(null, 1));
        assertArrayEquals(new int[]{}, ArraysTask1.removeElement(new int[]{5, 5, 5}, 5));
        assertArrayEquals(new int[]{2, 3}, ArraysTask1.removeElement(new int[]{1, 2, 1, 3, 1}, 1));
    }
}