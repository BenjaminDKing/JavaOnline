package com.fundamentals.exercises;

public class Lesson9Exercises {

    public void exercise1() {
        String[] iceCreamFlavors = {"Chocolate Chip", "Mint Chocolate Chip", "Reese's Peanut Butter Cup", "Vanilla",
                                    "Strawberry", "Coffee", "Cookies 'n' Cream"};
        for(int i = 0; i < iceCreamFlavors.length; i++) {
            System.out.println(iceCreamFlavors[i]);
        }
    }

    public void exercise2() {
        int[][] chiefsScores = {{40, 28, 33, 34, 19, 31, 30, 31, 26, 35, 24},
                {26, 10, 28, 30, 13, 24, 6, 24, 23, 32, 17}};

        for (int i = 0; i < chiefsScores.length; i++) {
            for (int k = 0; k < chiefsScores[i].length; k++) {
                System.out.println(chiefsScores[i][k]);
            }
        }
    }
}
