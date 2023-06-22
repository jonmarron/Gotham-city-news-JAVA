package com.jontxu.gothamCityNews.data;

public class LandVillain extends Character{
    public LandVillain(int iterationLevel){
        strengthMultiplier = 1;
        pocketSizeMultiplier = 2;
        strength = strengthMultiplier * iterationLevel;
        pocketSize = pocketSizeMultiplier * iterationLevel;
    }

}
