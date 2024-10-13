package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int b) {
        return b / x;
    }
    public int multiply(int c) {
        return x * c;
    }

    public int sumAllOperation(int z) {
        return sum(z) + multiply(z) + minus(z) + divide(z);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultSum = Calculator.sum(10);
        System.out.println("Sum: " + resultSum);

        int resultMinus = Calculator.minus(10);
        System.out.println("Minus: " + resultMinus);

        int resultDivide = calculator.divide(15);
        System.out.println("Divide: " + resultDivide);

        int resultMultiply = calculator.multiply(15);
        System.out.println("Multiply: " + resultMultiply);

        int resultSumAll = calculator.sumAllOperation(10);
        System.out.println("Sum of all operations: " + resultSumAll);
    }
}
