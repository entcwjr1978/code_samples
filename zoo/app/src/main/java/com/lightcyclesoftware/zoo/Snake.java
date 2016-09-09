package com.lightcyclesoftware.zoo;


public class Snake extends Animal {
    public static int speciesCount = 0;

    public Snake() {
        speciesCount++;
    }

    @Override
    public boolean makeSound() {
        if (super.makeSound()) {
            System.out.println("Snake: Hiss");
            return true;
        } else {
            return false;
        }
    }
}
