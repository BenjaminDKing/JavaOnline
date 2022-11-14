package com.fundamentals.exercises;

public class Swan extends WaterBirds {

    @Override
    public void forward() {
        super.forward();
        System.out.println("Swan moves forward.");
    }

    @Override
    public void backward() {
        super.backward();
        System.out.println("Swan moves backward.");
    }

    @Override
    public void standStill() {
        System.out.println("Swan is standing still.");
    }
}
