package basics.math;

/**
 * Завдання для вивчення складніших математичних операцій в Java
 * Tasks for learning advanced mathematical operations in Java
 */
public class AdvancedMathTask1 {

    /**
     * Обчислює факторіал числа
     * Calculates the factorial of a number
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n <= 1) return 1;

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Перевіряє чи є число простим
     * Checks if a number is prime
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Знаходить найбільший спільний дільник (НСД) двох чисел
     * Finds the Greatest Common Divisor (GCD) of two numbers
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Знаходить найменше спільне кратне (НСК) двох чисел
     * Finds the Least Common Multiple (LCM) of two numbers
     */
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / gcd(a, b);
    }

    /**
     * Обчислює n-те число Фібоначчі
     * Calculates the nth Fibonacci number
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers");
        }
        if (n <= 1) return n;

        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    /**
     * Перевіряє чи є число досконалим (дорівнює сумі своїх дільників, менших за нього)
     * Checks if a number is perfect (equals the sum of its proper divisors)
     */
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;

        int sum = 1; // 1 is always a divisor
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) { // Avoid adding the same divisor twice for perfect squares
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    /**
     * Перевертає цифри числа
     * Reverses the digits of a number
     */
    public static int reverseDigits(int n) {
        boolean isNegative = n < 0;
        n = Math.abs(n);

        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        return isNegative ? -reversed : reversed;
    }

    /**
     * Підраховує кількість цифр у числі
     * Counts the number of digits in a number
     */
    public static int countDigits(int n) {
        if (n == 0) return 1;

        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    /**
     * Підраховує суму цифр числа
     * Calculates the sum of digits of a number
     */
    public static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Перевіряє чи є число паліндромом
     * Checks if a number is a palindrome
     */
    public static boolean isPalindrome(int n) {
        return n == reverseDigits(n);
    }

    /**
     * Знаходить всі прості числа до n (решето Ератосфена)
     * Finds all prime numbers up to n (Sieve of Eratosthenes)
     */
    public static int[] sieveOfEratosthenes(int n) {
        if (n < 2) return new int[0];

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Count primes
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }

        // Collect primes
        int[] primes = new int[count];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes[index++] = i;
            }
        }

        return primes;
    }

    /**
     * Обчислює найбільшу цифру в числі
     * Finds the largest digit in a number
     */
    public static int largestDigit(int n) {
        n = Math.abs(n);
        if (n == 0) return 0;

        int maxDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            n /= 10;
        }
        return maxDigit;
    }
}