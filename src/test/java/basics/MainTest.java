package basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    public void testAdd() {
        assertEquals(42, Integer.sum(19, 23));
    }

    @Test
    public void firstTest() {
        Main main = new Main();
        Assertions.assertThrows(RuntimeException.class, main::testMe);
    }
}