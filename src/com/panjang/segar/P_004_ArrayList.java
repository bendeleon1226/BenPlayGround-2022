package com.panjang.segar;

import java.util.ArrayList;

public class P_004_ArrayList {
    public static void main(String[] args){
        ArrayList<String> houses = new ArrayList<>();
        houses.add("Bungalow at 27 Olive Road Singapore");
        houses.add("Bungalow at Binjai Park, Singapore");

        for(String house: houses)
            System.out.println(house);
    }
}
