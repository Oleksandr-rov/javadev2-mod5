package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void testFibonacciTest (){
        // Given
        int input = 10;
        // When
        int resultFibIteractive = FibonacciIterative.fibonacci(input);
        int resultFibRecursive = FibonacciRecursive.fibonacci(input);
        int resultFibDynamic = FibonacciDynamic.fibonacci(input);
        // Then
        int expected = 55;
        assertEquals(expected, resultFibIteractive);
        assertEquals(expected, resultFibRecursive);
        assertEquals(expected, resultFibDynamic);
    }

}
