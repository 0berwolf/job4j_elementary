package ru.job4j.ru.job4j.ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = ((182 - 100) * 1.15);
        return rsl;
    }

    public static double womanWeight(short height1) {
        double rsl = ((167 - 110) * 1.15);
        return rsl;
    }

    public static void main(String[] args) {
        short height = 182;
        double man = Fit.manWeight(height);
        System.out.println("Man 182 is " + man);
        short height1 = 167;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 167 is " + woman);

    }

}
