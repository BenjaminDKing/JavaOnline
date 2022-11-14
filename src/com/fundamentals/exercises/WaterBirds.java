package com.fundamentals.exercises;

public abstract class WaterBirds implements MovementInterface {

    @Override
    public void forward() {
        System.out.println("WaterBird forward!");
    }

    @Override
    public void backward() {
        System.out.println("WaterBird backward!");
    }

    public abstract void standStill();
}
