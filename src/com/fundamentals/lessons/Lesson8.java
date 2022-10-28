package com.fundamentals.lessons;

/*
*  The contents of this class is over Lesson 8 content
* Control Flow Statements
* */

public class Lesson8 {

    // This method shows an if statment
    public void basicIfExample(int num1, int num2) {
        System.out.println("Before if statement");
        if(num1 == num2 ) {
            System.out.println("Values are equal");
        } // End if statement
        System.out.println("After if statement");
    } // End method basicIfExample

    // This method shows an if else statement
    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if statement");
        if(alpha != beta) {
            System.out.println("The values are not equal.");
        } else {
            System.out.println("The values are equal");
        } // End if-else statement
        System.out.println("End of if/else statement");
    } // End method basicIfElseExample

    // This method shows an if else chain statement
    public void basicIfElseChainExample(int value){
        if(value < 30) {
            System.out.println("The value is less than 30.");
        } else if(value <= 40) {
            System.out.println("The value is greater than 30 but less than or equal to 40.");
        } else {
            System.out.println("the value is greater than 40.");
        } // End if-else chain
    } // End method basicIfElseChainExample

    // This method shows how to use the And/Or statement with an If statement
    public void basicIfAndOrExample(int num) {
        if(num > 100 || num < 50){
            System.out.println("The value is less than 50 or greater than 100.");
        } // End if statement

        if(num % 2 == 0 && num > 30) {
            System.out.println("The value is greater than 30 and an even number.");
        } // End if statement
    } // End method basic if and or example

    // This method shows how a switch statement is used
    public void basicSwitchExample(int day) {
        switch(day) {
            case 1:
                System.out.println("Day = 1");
                break;
            case 2:
            case 3:
                System.out.println("Day is either 2 or 3.");
                break;
            default:
                System.out.println("Day is greater than 3");
                break;
        } // End switch
    } // End method basicSwitchExample

    // This method shows how to do a while loop
    public void basicWhileExample() {
        int val = 0; // Initialized value
        while(val < 10) { // Expression
            System.out.println(val);
            val++; // Increment
        }
    } // End method basicWhileExample

    // This method shows how to do a do-while loop
    public void basicDoWhileExample() {
        int num = 0; // Initialized value
        do {
            if(num % 2 == 0) {
                System.out.println(num);
            }
            num++; // Increment
        } while(num < 24); // Expression
    } // End method basicDoWhileExample

    // This method shows how to do a for loop
    public void basicForLoopExample() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    } // End method basicForLoopExample

    // This method shows the branching statements of continue and break
    public void basicBranchExample() {
        for(int i = 0; i < 10; i++) {
            if(i == 2) {
                continue;
            }
            if(i == 4) {
                System.out.println("Loop breaks");
                break;
            }
            System.out.println(i);
        } // End for loop
        System.out.println("End of loop");
    } // End method basicBranchExample
} // End class
