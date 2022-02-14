package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    //Для теста метода getPlaceOfLiving() класса LionAlex
    final String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";


    @Test
    public void getCorrectPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(expectedPlaceOfLiving,lionAlex.getPlaceOfLiving());
    }

}