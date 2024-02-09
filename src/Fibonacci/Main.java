package Fibonacci;


// returns the nth Fibonacci number.

public class Main {
    public static void main(String[] args) {
        System.out.println("fibonacci(0) = " + fibonacci(0)); // 0
        System.out.println("fibonacci(1) = " + fibonacci(1)); // 1
        System.out.println("fibonacci(2) = " + fibonacci(2)); // 1
        System.out.println("fibonacci(3) = " + fibonacci(3)); // 2
        System.out.println("fibonacci(4) = " + fibonacci(4)); // 3
        System.out.println("fibonacci(5) = " + fibonacci(5)); // 5
        System.out.println("fibonacci(6) = " + fibonacci(6)); // 8
        System.out.println("fibonacci(7) = " + fibonacci(7)); // 13
        System.out.println("fibonacci(8) = " + fibonacci(8)); // 21
        System.out.println("fibonacci(9) = " + fibonacci(9)); // 34
        System.out.println("fibonacci(10) = " + fibonacci(10)); // 55
    }

    private static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1)  {
            return 1;
        } else {
            long nMinus1 = 1;
            long nMinus2 = 0;
            long fib = 0;
            for (int i = 1; i < n; i++) {
                fib = (nMinus2 + nMinus1);
                nMinus2 = nMinus1;
                nMinus1 = fib;
            }
            return fib;
        }
    }
}
