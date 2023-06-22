package com.jontxu.gothamCityNews;

import com.jontxu.gothamCityNews.data.Character;
import com.jontxu.gothamCityNews.data.CharacterType;
import com.jontxu.gothamCityNews.data.CityHall;
import com.jontxu.gothamCityNews.logic.CharacterFactory;
import com.jontxu.gothamCityNews.logic.FactoryProducer;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        FactoryProducer factoryProducer = new FactoryProducer(random);
        CityHall cityHall = new CityHall(250);
        for (int i = 0; i < 5; i++) {
            System.out.println("*----------------------------------------------------*");
            System.out.println("The current amount of resources is: " + cityHall.getResources());
            CharacterFactory factory = factoryProducer.getFactory();
            Character villain = factory.startCreation(CharacterType.VILLAIN, i);
            villain.introduce();
            cityHall.decrementAndGet(villain.getPocketSize());
            System.out.println("The villain stole " + villain.getPocketSize() + " resources from the City Hall.");
            System.out.println("The current amount of resources is: " + cityHall.getResources());
            Character superhero = factory.startCreation(CharacterType.SUPERHERO, i);
            if (fight(villain, superhero)) {
                cityHall.incrementAndGet(villain.getPocketSize());
                System.out.println("The hero saved the day and returned " + villain.getPocketSize() + " resources back to the City Hall!");
                System.out.println("The current amount of resources is: " + cityHall.getResources());
            };
            System.out.println("*----------------------------------------------------*");
        }
    }

    private static boolean fight(Character villain, Character superhero) {
        return superhero.getStrength() < villain.getStrength();
    }
}
