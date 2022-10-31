package com.fundamentals;
import com.fundamentals.lessons.*;
import com.fundamentals.exercises.Lesson5Exercises;
import com.fundamentals.exercises.Lesson6Exercises;
import com.fundamentals.exercises.Lesson7Exercises;
import com.fundamentals.exercises.Lesson8Exercises;

/*
* This Main class is the entry point to the application
* */
public class Main {

    public static void main(String[] args) {
        // This prints "Hello, Java!"
        //System.out.println("Hello, Java!");

        //House myHouse = new House();
        //lesson5Examples();
        //exercise5Example();
        //lesson6Examples();
        //exercise6Example();
        //lesson7Examples();
        //exercise7Example();
        //lesson8Examples();
        //exercise8Example();
        lesson9Examples();

    } // End main method

    public static void lesson5Examples() {
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10, 15);
        int value = myLesson5.showLocalWithReturn(25, 19);
        System.out.println(value);
        System.out.println(myLesson5.showLocalWithReturn(5, 8));
        myLesson5.showInstanceVariable();
        myLesson5.showConversions();

    } // End lesson5Examples method

    public static void exercise5Example() {
        Lesson5Exercises myExercises = new Lesson5Exercises();
        myExercises.exercise1();
        myExercises.exercise2();
        myExercises.exercise3();
    }

    public static void lesson6Examples() {
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleEquals("Happy");
        String myStr1 = myLesson6.exampleLowercase();
        System.out.println(myStr1);
        System.out.println(myLesson6.exampleUppercase());
        myLesson6.exampleLength();
        myLesson6.exampleBuilder("pizza", 3);
        myLesson6.exampleChar();
        myLesson6.exampleEscape();
    } // End method lesson6Examples

    public static void exercise6Example() {
        Lesson6Exercises myExercises6 = new Lesson6Exercises();
        myExercises6.exercise1("IS THIS LOWERCASE?");
        myExercises6.exercise2();
        myExercises6.exercise3();
    }

    public static void lesson7Examples() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        // myLesson7.addTwoNumber();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();
    }

    public static void exercise7Example() {
        Lesson7Exercises myExercises7 = new Lesson7Exercises();
        myExercises7.modulus(361);
        myExercises7.assignmentOperators(15, 13);
        myExercises7.pemdasExample();
    }

    public static void lesson8Examples() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,5);
        myLesson8.basicIfElseExample(12, 17);
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(108);
        myLesson8.basicSwitchExample(2);
        myLesson8.basicWhileExample();
        myLesson8.basicDoWhileExample();
        myLesson8.basicForLoopExample();
        myLesson8.basicBranchExample();
    }

    public static void exercise8Example() {
        Lesson8Exercises myExercises8 = new Lesson8Exercises();
        myExercises8.exercise1("A String", "A String");
        myExercises8.exercise1("A String", "A different string");
        System.out.println(myExercises8.exercise2('A'));
        System.out.println(myExercises8.exercise2('Z'));
        myExercises8.exercise3();
    }

    public static void lesson9Examples() {
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();
    }
} // End class
