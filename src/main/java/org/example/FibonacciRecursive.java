package org.example;

public class FibonacciRecursive {
    private FibonacciRecursive(){}
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
