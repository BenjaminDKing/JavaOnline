package com.fundamentals.exercises;

public class Lesson14Exercises {

    public static double voltage(double i, double r) {
        return i * r;
    }

    public static double current(double v, double r) {
        return v / r;
    }

    public static double resistance(double v, double i) {
        return v / i;
    }
}
