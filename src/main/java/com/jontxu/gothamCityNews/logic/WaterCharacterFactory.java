package com.jontxu.gothamCityNews.logic;

import com.jontxu.gothamCityNews.data.Character;
import com.jontxu.gothamCityNews.data.CharacterType;
import com.jontxu.gothamCityNews.data.WaterSuperhero;
import com.jontxu.gothamCityNews.data.WaterVillain;

import java.util.Random;

public class WaterCharacterFactory extends CharacterFactory{
    public WaterCharacterFactory(Random random) {
        this.random  = random;
    }

    @Override
    protected Character createCharacter(CharacterType characterType, int iterationLevel) {
        if(characterType.equals(CharacterType.VILLAIN)){
            return new WaterVillain(iterationLevel);
        } else if (characterType.equals(CharacterType.SUPERHERO)) {
            int strength = random.nextInt(5) + 1;
            return new WaterSuperhero(strength);
        }
        return null;
    }
}
