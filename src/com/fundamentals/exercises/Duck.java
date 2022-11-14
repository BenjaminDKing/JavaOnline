package com.fundamentals.exercises;

public class Duck extends WaterBirds {

    @Override
    public void forward() {
        super.forward();
        System.out.println("Duck moves forward.");
    }

    @Override
    public void backward() {
        super.backward();
        System.out.println("Duck moves backward.");
    }

    @Override
    public void standStill() {
        System.out.println("Duck is standing still.");
    }
}
