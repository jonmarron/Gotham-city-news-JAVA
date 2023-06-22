package com.jontxu.gothamCityNews.logic;

import com.jontxu.gothamCityNews.data.Character;
import com.jontxu.gothamCityNews.data.CharacterType;

import java.util.Random;

public abstract class CharacterFactory {
    Random random;
    public Character startCreation(CharacterType characterType, int iterationLevel){
        Character character;
        character = createCharacter(characterType, iterationLevel);
        return character;
    }
    protected abstract Character createCharacter(CharacterType characterType, int iterationLevel);
}
