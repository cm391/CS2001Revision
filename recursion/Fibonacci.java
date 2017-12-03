package recursion;

import java.util.ArrayList;

public class Fibonacci {
    static int fibCalls;

    public static long iterativeFib(long n) {
        if (n == 0) return 1;

        int twoPrevious = 1;
        int previous = 1;

        for (long i = 1; i < n; i++) {
            int fib = previous + twoPrevious;
            twoPrevious = previous;
            previous = fib;
        }

        return previous;
    }

    public static long recursiveFib(long n) {
        fibCalls++;
        if (n < 2) return 1;
        return recursiveFib(n - 2) + recursiveFib(n -1);
    }

    public static long memorisedFib(long n) {
        //TODO
        return 0;
    }

    public static void main(String[] args) {
        long n = 0;

        while (n < 30) {
            fibCalls = 0;
            System.out.println(n + ": " + recursiveFib(n) + " in " + fibCalls);
            n++;
        }
    }
}
