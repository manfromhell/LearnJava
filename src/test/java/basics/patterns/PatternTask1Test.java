package basics.patterns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тести для PatternTask1
 * Tests for PatternTask1
 */
public class PatternTask1Test {

    @Test
    public void testStarPyramid() {
        String expected4 = "   *\n  ***\n *****\n*******";
        assertEquals(expected4, PatternTask1.starPyramid(4));

        String expected1 = "*";
        assertEquals(expected1, PatternTask1.starPyramid(1));

        String expected2 = " *\n***";
        assertEquals(expected2, PatternTask1.starPyramid(2));

        assertEquals("", PatternTask1.starPyramid(0));
        assertEquals("", PatternTask1.starPyramid(-1));

        String expected3 = "  *\n ***\n*****";
        assertEquals(expected3, PatternTask1.starPyramid(3));
    }

    @Test
    public void testInvertedStarPyramid() {
        String expected4 = "*******\n *****\n  ***\n   *";
        assertEquals(expected4, PatternTask1.invertedStarPyramid(4));

        String expected1 = "*";
        assertEquals(expected1, PatternTask1.invertedStarPyramid(1));

        String expected2 = "***\n *";
        assertEquals(expected2, PatternTask1.invertedStarPyramid(2));

        assertEquals("", PatternTask1.invertedStarPyramid(0));
        assertEquals("", PatternTask1.invertedStarPyramid(-1));

        String expected3 = "*****\n ***\n  *";
        assertEquals(expected3, PatternTask1.invertedStarPyramid(3));
    }

    @Test
    public void testDiamond() {
        String expected3 = "  *\n ***\n*****\n ***\n  *";
        assertEquals(expected3, PatternTask1.diamond(3));

        String expected1 = "*";
        assertEquals(expected1, PatternTask1.diamond(1));

        String expected2 = " *\n***\n *";
        assertEquals(expected2, PatternTask1.diamond(2));

        assertEquals("", PatternTask1.diamond(0));
        assertEquals("", PatternTask1.diamond(-1));

        String expected4 = "   *\n  ***\n *****\n*******\n *****\n  ***\n   *";
        assertEquals(expected4, PatternTask1.diamond(4));
    }

    @Test
    public void testRectangle() {
        String expected5x3 = "*****\n*****\n*****";
        assertEquals(expected5x3, PatternTask1.rectangle(5, 3));

        String expected1x1 = "*";
        assertEquals(expected1x1, PatternTask1.rectangle(1, 1));

        String expected3x1 = "***";
        assertEquals(expected3x1, PatternTask1.rectangle(3, 1));

        String expected1x3 = "*\n*\n*";
        assertEquals(expected1x3, PatternTask1.rectangle(1, 3));

        assertEquals("", PatternTask1.rectangle(0, 3));
        assertEquals("", PatternTask1.rectangle(3, 0));
        assertEquals("", PatternTask1.rectangle(-1, 3));
    }

    @Test
    public void testHollowRectangle() {
        String expected5x4 = "*****\n*   *\n*   *\n*****";
        assertEquals(expected5x4, PatternTask1.hollowRectangle(5, 4));

        String expected1x1 = "*";
        assertEquals(expected1x1, PatternTask1.hollowRectangle(1, 1));

        String expected3x1 = "***";
        assertEquals(expected3x1, PatternTask1.hollowRectangle(3, 1));

        String expected1x3 = "*\n*\n*";
        assertEquals(expected1x3, PatternTask1.hollowRectangle(1, 3));

        String expected2x2 = "**\n**";
        assertEquals(expected2x2, PatternTask1.hollowRectangle(2, 2));

        String expected3x3 = "***\n* *\n***";
        assertEquals(expected3x3, PatternTask1.hollowRectangle(3, 3));

        assertEquals("", PatternTask1.hollowRectangle(0, 3));
        assertEquals("", PatternTask1.hollowRectangle(3, 0));
    }

    @Test
    public void testNumberTriangle() {
        String expected4 = "1\n12\n123\n1234";
        assertEquals(expected4, PatternTask1.numberTriangle(4));

        String expected1 = "1";
        assertEquals(expected1, PatternTask1.numberTriangle(1));

        String expected2 = "1\n12";
        assertEquals(expected2, PatternTask1.numberTriangle(2));

        assertEquals("", PatternTask1.numberTriangle(0));
        assertEquals("", PatternTask1.numberTriangle(-1));

        String expected6 = "1\n12\n123\n1234\n12345\n123456";
        assertEquals(expected6, PatternTask1.numberTriangle(6));
    }

    @Test
    public void testMultiplicationTable() {
        String expected3 = "1 2 3\n2 4 6\n3 6 9";
        assertEquals(expected3, PatternTask1.multiplicationTable(3));

        String expected1 = "1";
        assertEquals(expected1, PatternTask1.multiplicationTable(1));

        String expected2 = "1 2\n2 4";
        assertEquals(expected2, PatternTask1.multiplicationTable(2));

        assertEquals("", PatternTask1.multiplicationTable(0));
        assertEquals("", PatternTask1.multiplicationTable(-1));

        String expected4 = "1 2 3 4\n2 4 6 8\n3 6 9 12\n4 8 12 16";
        assertEquals(expected4, PatternTask1.multiplicationTable(4));
    }

    @Test
    public void testCheckerboard() {
        String expected4 = "* *\n * *\n* *\n * *";
        assertEquals(expected4, PatternTask1.checkerboard(4));

        String expected1 = "*";
        assertEquals(expected1, PatternTask1.checkerboard(1));

        String expected2 = "* \n *";
        assertEquals(expected2, PatternTask1.checkerboard(2));

        String expected3 = "* *\n * *\n* *";
        assertEquals(expected3, PatternTask1.checkerboard(3));

        assertEquals("", PatternTask1.checkerboard(0));
        assertEquals("", PatternTask1.checkerboard(-1));

        String expected5 = "* * *\n * * \n* * *\n * * \n* * *";
        assertEquals(expected5, PatternTask1.checkerboard(5));
    }

    @Test
    public void testNumberPyramid() {
        String expected4 = "   1\n  222\n 33333\n4444444";
        assertEquals(expected4, PatternTask1.numberPyramid(4));

        String expected1 = "1";
        assertEquals(expected1, PatternTask1.numberPyramid(1));

        String expected2 = " 1\n222";
        assertEquals(expected2, PatternTask1.numberPyramid(2));

        assertEquals("", PatternTask1.numberPyramid(0));
        assertEquals("", PatternTask1.numberPyramid(-1));

        String expected3 = "  1\n 222\n33333";
        assertEquals(expected3, PatternTask1.numberPyramid(3));
    }

    @Test
    public void testRightTriangle() {
        String expected4 = "*\n**\n***\n****";
        assertEquals(expected4, PatternTask1.rightTriangle(4));

        String expected1 = "*";
        assertEquals(expected1, PatternTask1.rightTriangle(1));

        String expected2 = "*\n**";
        assertEquals(expected2, PatternTask1.rightTriangle(2));

        assertEquals("", PatternTask1.rightTriangle(0));
        assertEquals("", PatternTask1.rightTriangle(-1));

        String expected5 = "*\n**\n***\n****\n*****";
        assertEquals(expected5, PatternTask1.rightTriangle(5));
    }
}