package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] mas = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int q = 0; q < size; q++) {
                mas[i][q] = (i + 1) * (q + 1);
            }
        }
        return mas;
    }
}

