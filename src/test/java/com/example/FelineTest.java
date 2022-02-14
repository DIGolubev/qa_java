package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    //Для теста метода eatMeat() класса Feline
    final List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
    //Для теста метода getFamily() класса Feline
    final String expectedFamily = "Кошачьи";
    //Для теста метода getKittens() класса Feline
    final int expectedKittens = 1;

    @Test
    public void getEatMeatCorrectReturn() throws Exception{
        List<String> actual = feline.eatMeat();
        assertEquals(expectedEatMeat, actual);
    }

    @Test
    public void getFamilyCorrectReturn(){

        assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void getKittensCorrectReturn(){

        assertEquals(expectedKittens, feline.getKittens());

    }
}
