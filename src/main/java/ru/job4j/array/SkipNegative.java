package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int q = 0; q < array[i].length; q++) {
               if (array[i][q] < 0) {
                   array[i][q] = 0;
                }
            }
        }
        return array;
    }
}
