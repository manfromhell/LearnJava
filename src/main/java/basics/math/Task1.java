package basics.math;

import java.util.Scanner;
import java.lang.Math;

/**
 * Simple math operations
 */
public class Task1 {

    /**
     * @return Сума двох чисел.
     */
    public int sum(int a, int b) {
        return -1; // TODO
    }

    /**
     * @return різниця двох чисел.
     */
    public int subtract(int a, int b) {
        return -1; // TODO
    }

    /**
     * @return добуток двох чисел.
     */
    public int multiply(int a, int b) {
        return -1; // TODO
    }

    /**
     * @return частка від ділення двох чисел.
     */
    public int divide(int a, int b) {
        return -1; // TODO
    }

    /**
     * @return квадрат числа.
     */
    public int sqr(int a) {
        return -1; // TODO
    }

    /**
     * @return куб числа.
     */
    public int sqr3(int a) {
        return -1; // TODO
    }

    /**
     * @return число a в степені b.
     */
    public int sqrN(int a, int b) {
        return -1; // TODO
    }

    public static void main(String[] args) {
        Task1 task = new Task1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + task.sum(num1, num2));
        System.out.println("The subtraction of " + num1 + " and " + num2 + " is: " + task.subtract(num1, num2));
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + task.multiply(num1, num2));
        System.out.println("The division of " + num1 + " and " + num2 + " is: " + task.divide(num1, num2));
    }

}
