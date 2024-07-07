package basics.cycles;

import java.util.Scanner;

public class CyclesTask2 {
    Scanner scanner = new Scanner(System.in);

    /**
     * Вивести на екран просте рівняння, зчитувати відповіді поки не буде введено правильну.
     * Приклад:
     * 3 + 4 =
     * 5
     * Невірно
     * 9
     * Невірно
     * 7
     * Вірно
     */
    public void readCorrectAnswer() {
        ///// Example of reading the number from console
        System.out.println("enter number");
        int n = scanner.nextInt();
        System.out.println("your number " + n);
        ////
    }

    public static void main(String[] args) {
        CyclesTask2 task2 = new CyclesTask2();
        task2.readCorrectAnswer();
    }

}
