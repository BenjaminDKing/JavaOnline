package com.fundamentals.exercises;
import java.util.Scanner;

public class Lesson7Exercises {

    public int modulus (int num1) {
        System.out.println("Please enter a number to divide the parameter number with.");
        System.out.println("The remainder will be returned:");
        Scanner input = new Scanner(System.in);
        int num2 = input.nextInt();
        int modulusValue = num1 % num2;
        System.out.println("The modulus value of " + num1 + " and " + num2 + " is " + modulusValue);
        return modulusValue;
    }

    public void assignmentOperators(double num1, double num2) {
        num1 += num2;
        System.out.println(num1 += num2);
        num1 -= num2;
        System.out.println(num1 -= num2);
        num1 *= num2;
        System.out.println(num1 *= num2);
        num1 /= num2;
        System.out.println(num1 /= num2);
    }

    public void pemdasExample() {
        System.out.println( 10 + 32 * 12 / 3 );
        System.out.println(( 10 + 32) * 12 / 3);
    }
}
