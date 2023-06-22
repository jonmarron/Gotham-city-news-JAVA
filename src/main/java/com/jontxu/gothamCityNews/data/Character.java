package com.jontxu.gothamCityNews.data;

public abstract class Character {
    float strengthMultiplier;
    float pocketSizeMultiplier;
    float strength;
    float pocketSize;

    public float getStrength() {
        return strength;
    }

    public float getPocketSize() {
        return pocketSize;
    }
    public void introduce(){};

}
