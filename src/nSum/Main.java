package nSum;


// nSum(int n) returns the sum of all numbers from 0 t0 n.
public class Main {

    public static void main(String[] args) {
        System.out.println("nSum(3) = " + nSum(3)); // 6
        System.out.println("nSum(10) = " + nSum(10)); // 55
        System.out.println("nSum(100) = " + nSum(100)); // 5050
    }

    public static long nSum(int n) {
        return ((long) n * (n + 1)) / 2;
    }
}
