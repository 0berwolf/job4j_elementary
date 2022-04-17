package ru.job4j.ru.job4j.ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double d = Math.sqrt((x2 - x1) * (x2 - x1)  + (y2 - y1) * (y2 - y1));
        return d;
    }

    public static double minus(int x2, int x1) {
        int x = x2 - x1;
        return x;
    }

    public static double minus1(int y2, int y1) {
        int y = y2 - y1;
        return y;
    }

    public static double pow(double x) {
        double first = Math.pow(x, 2);
        return first;
    }

    public static double pow1(double y) {
        double second = Math.pow(y, 2);
        return second;
    }

    public static double plus(double first, double second) {
        double result = first + second;
        return (result);
    }

    public static double sqrt(double result) {
        double sqrt = Math.sqrt(result);
        return sqrt;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(1, 3, 4, 2);
        System.out.println("result (4, 2) to (1, 3) " + result1);
        double result2 = Point.distance(2, 3, 5, 5);
        System.out.println("result (4, 2) to (1, 3) " + result2);
        double result3 = Point.distance(8, 6, 5, 10);
        System.out.println("result (4, 2) to (1, 3) " + result3);
    }
}
