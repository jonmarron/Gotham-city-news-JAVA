package com.jontxu.gothamCityNews.logic;

import com.jontxu.gothamCityNews.data.AirSuperhero;
import com.jontxu.gothamCityNews.data.AirVillain;
import com.jontxu.gothamCityNews.data.Character;
import com.jontxu.gothamCityNews.data.CharacterType;

import java.util.Random;

public class AirCharacterFactory extends CharacterFactory{

    public AirCharacterFactory(Random random) {
        this.random = random;
    }

    @Override
    protected Character createCharacter(CharacterType characterType, int iterationLevel) {
        if(characterType.equals(CharacterType.VILLAIN)){
            return new AirVillain(iterationLevel);
        } else if (characterType.equals(CharacterType.SUPERHERO)) {
            int strength = random.nextInt(5) + 1;
            return new AirSuperhero(strength);
        }
        return null;
    }
}
