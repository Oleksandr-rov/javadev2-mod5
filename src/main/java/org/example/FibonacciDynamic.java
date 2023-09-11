package org.example;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic {
    private FibonacciDynamic(){}
    private static final Map<Integer, Integer> memo = new HashMap<>();
    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        if (memo.containsKey(number)) {
            return memo.get(number);
        }
        int fibCalc = fibonacci(number - 1) + fibonacci(number - 2);
        memo.put(number, fibCalc);
        return fibCalc;
    }
}
