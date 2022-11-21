package com.fundamentals.exercises;

import java.util.Scanner;

public class Lesson18Exercises {

    public void isLeapYear() {
        System.out.println("Please provide a year: ");
        Scanner input = new Scanner(System.in);
        String strInput = input.next();

        try {
            int numInput = Integer.parseInt(strInput);
            if(strInput.length() == 4 && numInput > 0) {
                if (numInput % 4 == 0) {
                    System.out.println("It's a leap year!");
                } else {
                    System.out.println("Not a leap year :(");
                }
            } else {
                System.out.println("Invalid year. Please provide a four-digit year.");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("There's been a number format exception: " + nfe);
        }
    }
}
