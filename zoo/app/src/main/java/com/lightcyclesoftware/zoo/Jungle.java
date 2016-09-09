package com.lightcyclesoftware.zoo;


import java.util.ArrayList;
import java.util.List;

public class Jungle {
    private List<Animal> animals = new ArrayList<Animal>();

    public void soundOff() {
        for (Animal animal : animals) {
            animal.makeSound();
            animal.displayEnergyLevel();
        }
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
