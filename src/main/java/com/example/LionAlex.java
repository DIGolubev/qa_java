package com.example;

import java.util.HashMap;

public class LionAlex extends Lion{

    //Место обитания
    final String placeOfLiving = "Нью-Йоркский зоопарк";


    public LionAlex(Feline feline) throws Exception{
        super("Самец", feline);
    }

    /**
     * Возвращает место, где живёт LoinAlex
     */
    public String getPlaceOfLiving(){
        return placeOfLiving;
    }

    /**
     * возвращает список имён друзей LoinAlex
     */
    public HashMap<String,String> getFriends(){
        HashMap<String,String> friendsAlexLion = new HashMap<>();
        friendsAlexLion.put("зебра", "Марти");
        friendsAlexLion.put("бегемотиха", "Глория");
        friendsAlexLion.put("жираф", "Мелман");
        return friendsAlexLion;
    }
}
