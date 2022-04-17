package ru.job4j.ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.17f;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.86f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.dollarToEuro(40);
        System.out.println("40 dollar is " + euro + " euro.");
        float dollars = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollars + " dollars.");
        dollars = Converter.euroToDollar(12);
        System.out.println("12 euro is " + dollars + " dollars");
    }
}
