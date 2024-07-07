package basics.cycles;

import org.junit.jupiter.api.Test;

class CyclesTask1Test {

    CyclesTask1 task1 = new CyclesTask1();

    @Test
    void printAllNumbers() {
        task1.printAllNumbers(10);
    }

    @Test
    void printAllNumbersReversed() {
        task1.printAllNumbersReversed(10);
    }

    @Test
    void printAllNumbersInBetween() {
        task1.printAllNumbersInBetween(10, 20);
    }

    @Test
    void printAllOddNumbersInBetween() {
        task1.printAllOddNumbersInBetween(10, 30);
    }

    @Test
    void printAllOddNumbersInBetweenReversed() {
        task1.printAllOddNumbersInBetweenReversed(10, 30);
    }
}