package ru.job4j;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - b));
        return s;
    }

    public static void main(String[] args) {
        double p = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + p);
    }
}
