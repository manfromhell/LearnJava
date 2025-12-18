package basics.patterns;

/**
 * Завдання для вивчення створення візуальних патернів в Java
 * Tasks for learning visual pattern creation in Java
 */
public class PatternTask1 {

    /**
     * Створює піраміду з зірочок
     * Creates a star pyramid
     *
     * Example for height=4:
     *    *
     *   ***
     *  *****
     * *******
     */
    public static String starPyramid(int height) {
        if (height <= 0) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            // Add spaces
            for (int j = 0; j < height - i; j++) {
                result.append(" ");
            }
            // Add stars
            for (int k = 0; k < 2 * i - 1; k++) {
                result.append("*");
            }
            if (i < height) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Створює перевернуту піраміду з зірочок
     * Creates an inverted star pyramid
     *
     * Example for height=4:
     * *******
     *  *****
     *   ***
     *    *
     */
    public static String invertedStarPyramid(int height) {
        if (height <= 0) return "";

        StringBuilder result = new StringBuilder();
        for (int i = height; i >= 1; i--) {
            // Add spaces
            for (int j = 0; j < height - i; j++) {
                result.append(" ");
            }
            // Add stars
            for (int k = 0; k < 2 * i - 1; k++) {
                result.append("*");
            }
            if (i > 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Створює ромб з зірочок
     * Creates a diamond pattern with stars
     *
     * Example for size=3:
     *   *
     *  ***
     * *****
     *  ***
     *   *
     */
    public static String diamond(int size) {
        if (size <= 0) return "";

        StringBuilder result = new StringBuilder();

        // Upper half (including middle)
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                result.append(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                result.append("*");
            }
            if (i < size) {
                result.append("\n");
            }
        }

        // Lower half
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 0; j < size - i; j++) {
                result.append(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                result.append("*");
            }
            if (i > 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }

    /**
     * Створює прямокутник з зірочок
     * Creates a rectangle with stars
     *
     * Example for width=5, height=3:
     * *****
     * *****
     * *****
     */
    public static String rectangle(int width, int height) {
        if (width <= 0 || height <= 0) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result.append("*");
            }
            if (i < height - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Створює порожнистий прямокутник з зірочок
     * Creates a hollow rectangle with stars
     *
     * Example for width=5, height=4:
     * *****
     * *   *
     * *   *
     * *****
     */
    public static String hollowRectangle(int width, int height) {
        if (width <= 0 || height <= 0) return "";
        if (width == 1 || height == 1) return rectangle(width, height);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    result.append("*");
                } else {
                    result.append(" ");
                }
            }
            if (i < height - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Створює трикутник з чисел
     * Creates a triangle with numbers
     *
     * Example for height=4:
     * 1
     * 12
     * 123
     * 1234
     */
    public static String numberTriangle(int height) {
        if (height <= 0) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                result.append(j);
            }
            if (i < height) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Створює таблицю множення
     * Creates a multiplication table
     *
     * Example for size=3:
     * 1 2 3
     * 2 4 6
     * 3 6 9
     */
    public static String multiplicationTable(int size) {
        if (size <= 0) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                result.append(i * j);
                if (j < size) {
                    result.append(" ");
                }
            }
            if (i < size) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Створює шаховну дошку
     * Creates a checkerboard pattern
     *
     * Example for size=4:
     * * *
     *  * *
     * * *
     *  * *
     */
    public static String checkerboard(int size) {
        if (size <= 0) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    result.append("*");
                } else {
                    result.append(" ");
                }
            }
            if (i < size - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Створює пірамиду з чисел (кожен рядок містить однакові числа)
     * Creates a number pyramid (each row contains the same numbers)
     *
     * Example for height=4:
     *    1
     *   222
     *  33333
     * 4444444
     */
    public static String numberPyramid(int height) {
        if (height <= 0) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            // Add spaces
            for (int j = 0; j < height - i; j++) {
                result.append(" ");
            }
            // Add numbers
            for (int k = 0; k < 2 * i - 1; k++) {
                result.append(i);
            }
            if (i < height) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Створює прямокутний трикутник з зірочок
     * Creates a right triangle with stars
     *
     * Example for height=4:
     * *
     * **
     * ***
     * ****
     */
    public static String rightTriangle(int height) {
        if (height <= 0) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                result.append("*");
            }
            if (i < height) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}