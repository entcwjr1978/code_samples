package com.lightcyclesoftware.zoo;


import java.util.EnumSet;

public class Animal implements AnimalInterface {
    int energy = 0;
    boolean canPlay = false;
    EnumSet<Food> incompatibleFoods;

    @Override
    public boolean makeSound() {
        if (energy >= 3) {
            energy -= 3;
            return true;
        } else {
            System.out.println(this.getClass().getSimpleName() + " does not have the energy to make a sound");
            return false;
        }
    }

    @Override
    public void eatFood(Food food) {
        if (incompatibleFoods != null && incompatibleFoods.contains(food)) {
            System.out.println(this.getClass().getSimpleName()
                    + " is unable to eat this food");
        } else {
            energy += 5;
        }
    }

    @Override
    public void sleep() {
        energy += 10;
    }

    @Override
    public void play() {

    }

    protected void displayEnergyLevel() {
        System.out.println("Energy level for "
                + this.getClass().getSimpleName()
                + " is" + Integer.toString(energy));
    }
}
