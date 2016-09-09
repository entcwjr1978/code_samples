package com.lightcyclesoftware.zoo;


public class Monkey extends Animal {
    public static int speciesCount = 0;

    public Monkey () {
        canPlay = true;
        speciesCount++;
    }

    @Override
    public boolean makeSound() {
        if (energy >= 4) {
            System.out.println("Monkey: Oooo");
            energy -= 4;
            return true;
        } else {
            System.out.println("Monkey does not have the energy to make a sound");
            return false;
        }
    }

    @Override
    public void eatFood(Food food) {
        energy += 2;
    }

    @Override
    public void play() {
        if (energy >= 8) {
            System.out.println("Oooo Oooo Oooo");
            energy -= 8;
        } else {
            System.out.println("Monkey is too tired.");
        }
    }
}
