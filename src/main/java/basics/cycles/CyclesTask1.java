package basics.cycles;

import java.util.Scanner;

/**
 * Simple cycle operations
 */
public class CyclesTask1 {
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 1
        for (int i = 1; i < 4; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        // 2
        int i = 4;
        while (i <= 6) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        // 3
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 10);
    }

    /**
     * Надрукувати числа від 1 до N
     */
    public void printAllNumbers(int n) {
    }

    /**
     * Надрукувати числа від N до 1.
     */
    public void printAllNumbersReversed(int n) {

    }

    /**
     * Надрукувати числа від A до B
     */
    public void printAllNumbersInBetween(int a, int b) {

    }

    /**
     * Надрукувати всі непарні числа між A та B
     */
    public void printAllOddNumbersInBetween(int a, int b) {

    }

    /**
     * Надрукувати всі непарні числа між A та B в зворотньому порядку.
     */
    public void printAllOddNumbersInBetweenReversed(int a, int b) {

    }

}
