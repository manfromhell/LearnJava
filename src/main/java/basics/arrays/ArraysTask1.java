package basics.arrays;

/**
 * Завдання для вивчення роботи з масивами в Java
 * Tasks for learning array operations in Java
 */
public class ArraysTask1 {

    /**
     * Знаходить суму всіх елементів масиву
     * Finds the sum of all elements in an array
     */
    public static int sum(int[] arr) {
        if (arr == null) return 0;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * Знаходить середнє арифметичне елементів масиву
     * Finds the average of all elements in an array
     */
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) return 0.0;

        return (double) sum(arr) / arr.length;
    }

    /**
     * Знаходить максимальний елемент масиву
     * Finds the maximum element in an array
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Знаходить мінімальний елемент масиву
     * Finds the minimum element in an array
     */
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Знаходить індекс першого входження елемента в масиві
     * Finds the index of the first occurrence of an element in an array
     */
    public static int findFirst(int[] arr, int element) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Знаходить індекс останнього входження елемента в масиві
     * Finds the index of the last occurrence of an element in an array
     */
    public static int findLast(int[] arr, int element) {
        if (arr == null) return -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Підраховує кількість входжень елемента в масиві
     * Counts the number of occurrences of an element in an array
     */
    public static int count(int[] arr, int element) {
        if (arr == null) return 0;

        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }

    /**
     * Перевертає масив
     * Reverses an array
     */
    public static int[] reverse(int[] arr) {
        if (arr == null) return null;

        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    /**
     * Перевіряє чи є масив відсортованим за зростанням
     * Checks if an array is sorted in ascending order
     */
    public static boolean isSortedAscending(int[] arr) {
        if (arr == null || arr.length <= 1) return true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Перевіряє чи є масив відсортованим за спаданням
     * Checks if an array is sorted in descending order
     */
    public static boolean isSortedDescending(int[] arr) {
        if (arr == null || arr.length <= 1) return true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Знаходить другий найбільший елемент масиву
     * Finds the second largest element in an array
     */
    public static int findSecondMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("All elements are the same");
        }

        return secondMax;
    }

    /**
     * Перевіряє чи містить масив дублікати
     * Checks if an array contains duplicates
     */
    public static boolean hasDuplicates(int[] arr) {
        if (arr == null || arr.length <= 1) return false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Видаляє всі входження заданого елемента з масиву
     * Removes all occurrences of a given element from an array
     */
    public static int[] removeElement(int[] arr, int element) {
        if (arr == null) return null;

        int count = count(arr, element);
        if (count == 0) return arr.clone();

        int[] result = new int[arr.length - count];
        int index = 0;

        for (int num : arr) {
            if (num != element) {
                result[index++] = num;
            }
        }
        return result;
    }
}