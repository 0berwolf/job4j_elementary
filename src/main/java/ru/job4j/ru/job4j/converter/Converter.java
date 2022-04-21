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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float in1 = 120;
        float expected1 = 2;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("120 rubles are 2. Test result : " + passed1);
        float in2 = 40;
        float expected2 = in2 * 0.86f;
        float out2 = Converter.dollarToEuro(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("40 dollars is 34.4. Test result : " + passed2);
        float in3 = 12;
        float expected3 = in3 * 1.17f;
        float out3 = Converter.euroToDollar(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("12 euro is 14.039999. Test result : " + passed3);

    }
}
