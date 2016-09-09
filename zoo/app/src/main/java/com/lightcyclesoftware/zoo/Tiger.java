package com.lightcyclesoftware.zoo;


import java.util.EnumSet;

public class Tiger extends Animal {
    public static int speciesCount = 0;

    public Tiger () {
        super();
        incompatibleFoods = EnumSet.of(Food.GRAIN);
        speciesCount++;
    }

    @Override
    public void sleep() {
        energy += 5;
    }

    @Override
    public boolean makeSound() {
        if (super.makeSound()) {
            System.out.println("Tiger: Roar");
            return true;
        } else {
            return false;
        }
    }
}
