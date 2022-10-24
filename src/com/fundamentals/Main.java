package com.fundamentals;
import com.fundamentals.lessons.Lesson5;

/*
* This Main class is the entry point to the application
* */
public class Main {

    public static void main(String[] args) {
        // This prints "Hello, Java!"
        //System.out.println("Hello, Java!");

        //House myHouse = new House();
        lesson5Examples();
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

} // End class
