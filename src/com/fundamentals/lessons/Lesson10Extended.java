package com.fundamentals.lessons;

/*
* This class along with the class Lesson10 will demonstrate
* Access Modifiers
* */
public class Lesson10Extended {

    /* This method will demonstrate how to call a default method
    from another class in the same package
    */
    public void methodFromOtherClass() {
        System.out.println("This method is public and from the Lesson10Extended");
        Lesson10 lesson10 = new Lesson10();
        lesson10.myDefaultMethod();
        lesson10.myProtectedMethod();
    }
}
