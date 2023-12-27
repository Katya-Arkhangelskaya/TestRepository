package lesson9.tech.skelar.TestRepository;

import java.util.stream.Stream;

public class MethodFibonacci {
    public static void main(String[] args) {
        int n = 25;
        long result = calculate(n);
        System.out.println("Fibonacci number (" + n + ") \uD83D\uDCAC = " + result + " ✅");
    }

    public static long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N must be at least 0");
        }

        return Stream.iterate(new long[]{0, 1}, fib -> new long[]{fib[1], fib[0] + fib[1]})
                .limit(n + 1)
                .reduce((first, second) -> second)
                .orElseThrow()
                [0];
    }
}

