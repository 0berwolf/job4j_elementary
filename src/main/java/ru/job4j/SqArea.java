package ru.job4j;

public class SqArea {
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = h * k;
        int s = w * h;
        return s;
    }

    public static void main(String[] args) {
        int rsl = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + rsl);
        int rsl2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + rsl2);
        int rsl3 = SqArea.square(8, 3);
        System.out.println(" p = 8, k = 3, s = 3, real = " + rsl3);
    }
}
