package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int number;
    private final int expected;

    public FelineParameterizedTest(int number,int expected) {

        this.number = number;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getDataForKittens() {
        return new Object[][]{
                {2, 2},
                {3, 3},
                {5, 5},
        };
    }

    @Test
    public void testKittensArgumentTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(number);
        Assert.assertEquals(expected, actual);
    }
}
