package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return d;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(1, 3, 4, 2);
        System.out.println("result (1, 3) to (4, 2) " + result1);
        double result2 = Point.distance(2, 3, 5, 5);
        System.out.println("result (2, 3) to (5, 5) " + result2);
        double result3 = Point.distance(5, 6, 8, 9);
        System.out.println("result (5, 6) to (8, 10) " + result3);
    }
}
