package Factorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("factorial(4) = " + factorial(4)); // 24
        System.out.println("factorial(4) = " + factorial(5)); // 120
        System.out.println("factorial(4) = " + factorial(10)); // 3,628,800
    }

    public static long factorial(int n) {
        if (n == 0) return 1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
