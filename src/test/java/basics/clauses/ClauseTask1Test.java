package basics.clauses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClauseTask1Test {

    ClauseTask1 task1 = new ClauseTask1();

    @Test
    void odd() {
        assertTrue(task1.odd(31));
        assertFalse(task1.odd(22));
        assertFalse(task1.odd(0));
    }

    @Test
    void equal() {
        assertFalse(task1.equal(4, 6));
        assertTrue(task1.equal(3, 3));
    }

    @Test
    void smallerBiggerEqual() {
        assertEquals(-1, task1.smallerBiggerEqual(3,7));
        assertEquals(0, task1.smallerBiggerEqual(9,9));
        assertEquals(1, task1.smallerBiggerEqual(6,2));
    }

    @Test
    void equal3() {
        assertFalse(task1.equal3(2,4,7));
        assertTrue(task1.equal3(4,4,4));
    }

    @Test
    void sorted() {
        assertTrue(task1.equal3(3,4,5));
        assertTrue(task1.equal3(4,4,4));
        assertTrue(task1.equal3(6,4,2));
        assertFalse(task1.equal3(6,4,7));
    }

    @Test
    void pairsAtLeastOne() {
        assertFalse(task1.equal3(3,4,5));
        assertTrue(task1.equal3(4,4,4));
        assertTrue(task1.equal3(6,4,6));
        assertFalse(task1.equal3(6,4,7));
    }

    @Test
    void pairsExactlyOne() {
        assertFalse(task1.equal3(3,4,5));
        assertFalse(task1.equal3(4,4,4));
        assertTrue(task1.equal3(6,4,6));
        assertTrue(task1.equal3(6,7,7));
    }
}