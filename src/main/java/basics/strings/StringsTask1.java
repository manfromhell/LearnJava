package basics.strings;

/**
 * Завдання для вивчення роботи з рядками в Java
 * Tasks for learning string operations in Java
 */
public class StringsTask1 {

    /**
     * Повертає довжину рядка
     * Returns the length of a string
     */
    public static int getLength(String str) {
        if (str == null) return 0;
        return str.length();
    }

    /**
     * Перевіряє чи є рядок паліндромом (читається однаково в обох напрямках)
     * Checks if a string is a palindrome (reads the same forwards and backwards)
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) return true;

        String cleaned = str.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Підраховує кількість голосних літер у рядку
     * Counts the number of vowels in a string
     */
    public static int countVowels(String str) {
        if (str == null) return 0;

        int count = 0;
        String vowels = "aeiouаеіоуиїєю";

        for (char c : str.toLowerCase().toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Підраховує кількість приголосних літер у рядку
     * Counts the number of consonants in a string
     */
    public static int countConsonants(String str) {
        if (str == null) return 0;

        int count = 0;
        String vowels = "aeiouаеиіоуяюєї";

        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Перевертає рядок
     * Reverses a string
     */
    public static String reverse(String str) {
        if (str == null) return null;

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    /**
     * Підраховує кількість слів у рядку
     * Counts the number of words in a string
     */
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;

        return str.trim().split("\\s+").length;
    }

    /**
     * Перевіряє чи містить рядок тільки цифри
     * Checks if a string contains only digits
     */
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Капіталізує перші літери кожного слова
     * Capitalizes the first letter of each word
     */
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;

        String[] words = str.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) result.append(" ");
            if (!words[i].isEmpty()) {
                result.append(Character.toUpperCase(words[i].charAt(0)));
                if (words[i].length() > 1) {
                    result.append(words[i].substring(1));
                }
            }
        }
        return result.toString();
    }

    /**
     * Підраховує кількість входжень підрядка в рядок
     * Counts the number of occurrences of a substring in a string
     */
    public static int countOccurrences(String str, String substring) {
        if (str == null || substring == null || substring.isEmpty()) return 0;

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    /**
     * Видаляє всі пробіли з рядка
     * Removes all spaces from a string
     */
    public static String removeSpaces(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s", "");
    }
}