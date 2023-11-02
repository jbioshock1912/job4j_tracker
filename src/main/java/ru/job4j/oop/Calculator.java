package ru.job4j.oop;

import java.sql.SQLOutput;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return x / y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        System.out.println(minus(3) + " вызов статический метод minus");
        System.out.println(calculator.divide(4) + " вызов нестатический метод divide");
        System.out.println(calculator.sumAllOperation(3) + " вызов нестатический метод sumAllOperation");
    }
}
