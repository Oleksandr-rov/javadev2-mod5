package org.example;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число для розрахунку числа Фібоначі:");
        int n = scanner.nextInt();
        System.out.println("Фібоначчі ітераційний = " + FibonacciIterative.fibonacci(n));
        System.out.println("Фібоначчі рекурсивний = " + FibonacciRecursive.fibonacci(n));
        System.out.println("Фібоначчі динамічний = " + FibonacciDynamic.fibonacci(n));
    }
}
