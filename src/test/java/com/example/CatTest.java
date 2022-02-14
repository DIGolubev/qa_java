package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    Feline feline = new Feline();

    //Для теста метода getSound() класса Cat
    final String expectedSound = "Мяу";
    //Для теста метода getFood() класса Cat
    final List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void getCorrectSoundReturn() {

        //Arrange
        Cat cat = new Cat(feline);
        //Act
        String actualSound = cat.getSound();
        //Assert
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getTypeOfFoodCat() throws Exception {

        Cat cat = new Cat(feline);

        List<String> actualEatMeat = cat.getFood();

        assertEquals(expectedEatMeat, actualEatMeat);
    }
}
