package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    //Для теста метода getKittens() класса Lion
    final String sex = "Самка";
    final int expectedGetKittens = 1;
    //Для теста метода getFood() класса Lion
    final List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void getCorrectKittens() throws Exception{

        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);

        int actualGetKittens = lion.getKittens();

        assertEquals(expectedGetKittens, actualGetKittens);

    }

    @Test
    public void getCorrectFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные","Птицы","Рыба"));

        List<String> actualFood = lion.getFood();

        assertEquals(expectedFood, actualFood);
    }

}