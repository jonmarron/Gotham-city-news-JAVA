package com.jontxu.gothamCityNews.data;

public class WaterVillain extends Character{
    public WaterVillain(int iterationLevel) {
        strengthMultiplier = 2;
        pocketSizeMultiplier = 1;
        strength = strengthMultiplier * iterationLevel;
        pocketSize = (strengthMultiplier/2) * iterationLevel;
    }
}
