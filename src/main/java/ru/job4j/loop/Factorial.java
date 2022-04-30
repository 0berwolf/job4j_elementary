package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int calc = 2; calc <= n; calc++) {
            result = result * calc;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(6));
        System.out.println(calc(4));
        System.out.println(calc(7));
    }
}
