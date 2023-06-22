package com.jontxu.gothamCityNews.logic;

import com.jontxu.gothamCityNews.data.Character;

import java.util.List;
import java.util.Random;

public class FactoryProducer {
    private List<CharacterFactory> factories;
    private final Random random;


    public FactoryProducer(Random random) {
        this.random = random;
        factories = List.of(new AirCharacterFactory(random),
                new WaterCharacterFactory(random),
                new LandCharacterFactory(random));
    }

    public CharacterFactory getFactory(){
        int randomIndex = random.nextInt(factories.size());
        return factories.get(randomIndex);
    }
}
