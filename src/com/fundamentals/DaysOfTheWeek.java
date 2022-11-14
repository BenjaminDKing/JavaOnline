package com.fundamentals;

/*
* This enum is part of Lesson 16
* */

public enum DaysOfTheWeek {
    SUN, MON, TUE, WED, THU, FRI, SAT;

    public static void main(String[] args) {
        System.out.println("Hello Enum");
    }

    private DaysOfTheWeek() {
        System.out.println("Enum constructor called");
    }

    public void enumMethod() {
        System.out.println("Method inside enum called");
    }
}
