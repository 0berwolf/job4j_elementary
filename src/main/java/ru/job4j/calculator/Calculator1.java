package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class Calculator1 {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sum1(double first, double second) {
        return mns(first, second) + delenie(first, second);
    }

    public static double sum2(double first, double second) {
        return sum(first, second) + multiply(first, second) + mns(first, second) + delenie(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + sum1(23, 36));
        System.out.println("Результат расчёта равен: " + sum2(9, 18));

    }

}


