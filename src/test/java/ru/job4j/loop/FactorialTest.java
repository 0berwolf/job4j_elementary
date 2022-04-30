package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void calcForSix() {
        int result = Factorial.calc(6);
        int expected = 720;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void calcForFour() {
        int result = Factorial.calc(4);
        int expected = 24;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void calcForSeven() {
        int result = Factorial.calc(7);
        int expected = 5040;
        Assert.assertEquals(expected, result);
    }
}