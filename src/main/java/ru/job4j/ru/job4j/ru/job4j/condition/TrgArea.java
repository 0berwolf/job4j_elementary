package ru.job4j.ru.job4j.ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl = -1;
        double p = (a + b + c) / 2;
        double first = p - a;
        double second = p - b;
        double three = p - c;
        double four = p * first * second * three;
        double five = Math.sqrt(four);
        return five;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(3, 3, 3);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}