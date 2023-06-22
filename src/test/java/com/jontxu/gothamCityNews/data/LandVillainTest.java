package com.jontxu.gothamCityNews.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LandVillainTest {
    Character landVillain = new LandVillain(2);
    @Test
    void getStrenght(){
        float expected = 2;
        float result = landVillain.getStrength();
        assertEquals(expected, result);
    }

    @Test
    void getPocketSize(){
        float expected = 4;
        float result = landVillain.getPocketSize();
        assertEquals(expected, result);
    }

}