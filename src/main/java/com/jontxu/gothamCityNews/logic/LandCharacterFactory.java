package com.jontxu.gothamCityNews.logic;

import com.jontxu.gothamCityNews.data.Character;
import com.jontxu.gothamCityNews.data.CharacterType;
import com.jontxu.gothamCityNews.data.LandSuperhero;
import com.jontxu.gothamCityNews.data.LandVillain;

import java.util.Random;

public class LandCharacterFactory extends CharacterFactory{
    public LandCharacterFactory(Random random) {
        this.random = random;
    }

    @Override
    protected Character createCharacter(CharacterType characterType, int iterationLevel) {
        if(characterType.equals(CharacterType.VILLAIN)){
            return new LandVillain(iterationLevel);
        } else if (characterType.equals(CharacterType.SUPERHERO)) {
            int strength = random.nextInt(5) + 1;
            return new LandSuperhero(strength);
        }
        return null;
    }
}
