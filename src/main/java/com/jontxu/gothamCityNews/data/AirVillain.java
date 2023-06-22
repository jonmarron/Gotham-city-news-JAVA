package com.jontxu.gothamCityNews.data;

public class AirVillain extends Character{
    public AirVillain(int iterationLevel) {
        strengthMultiplier = 1.2f;
        pocketSizeMultiplier = 1.3f;
        strength = (strengthMultiplier * iterationLevel) -2;
        pocketSize = (strengthMultiplier * 2) + 5;
    }

    public void introduce(){
        System.out.println("I am an Air Villain and i am going to steal your shit");
    }
}
