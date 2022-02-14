package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionAlexParameterizedTest {

    private final String animalFriend;
    private final String friendName;


    public LionAlexParameterizedTest(String animalFriend, String friendName){
        this.animalFriend = animalFriend;
        this.friendName = friendName;
    }

    @Parameterized.Parameters
    public static Object[][] getFriendsData(){
        return new Object[][] {
                {"зебра", "Марти"},
                {"бегемотиха", "Глория"},
                {"жираф", "Мелман"},
        };
    }

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Feline feline;

    @Test
    public void getCorrectFriends() throws Exception{
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(friendName,lionAlex.getFriends().get(animalFriend));
    }
}