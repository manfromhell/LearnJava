package basics.math.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometryTask1Test {

    GeometryTask1 task = new GeometryTask1();

    @Test
    void square() {
        assertEquals(6, task.square(2,3));
    }

    @Test
    void perimeter() {
        assertEquals(10, task.perimeter(2,3));
    }

    @Test
    void squareOfSquare() {
        assertEquals(9, task.squareOfSquare(3));
    }

    @Test
    void perimeterOfSquare() {
        assertEquals(12, task.perimeterOfSquare(3));
    }

    @Test
    void existingTriangle() {
        assertTrue(task.existingTriangle(2,3, 4));
        assertFalse(task.existingTriangle(2,3, 6));
        assertFalse(task.existingTriangle(6, 2,3));
    }

    @Test
    void rightTriangle() {
        assertTrue(task.rightTriangle(5,3, 4));
        assertFalse(task.rightTriangle(6, 2,3));
    }
}