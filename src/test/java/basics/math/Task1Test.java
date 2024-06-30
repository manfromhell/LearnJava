package basics.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task = new Task1();

    @Test
    void sum() {
        assertEquals(3, task.sum(1, 2));
        assertEquals(0, task.sum(1, -1));
    }

    @Test
    void subtract() {
        assertEquals(-1, task.subtract(1, 2));
        assertEquals(2, task.subtract(1, -1));
    }

    @Test
    void multiply() {
        assertEquals(6, task.multiply(3, 2));
        assertEquals(-8, task.multiply(1, -8));
    }

    @Test
    void divide() {
        assertEquals(2, task.divide(4, 2));
        assertEquals(-1, task.divide(8, -4));
    }

    @Test
    void sqr() {
        assertEquals(16, task.sqr(4));
        assertEquals(4, task.sqr(-2));
    }
}