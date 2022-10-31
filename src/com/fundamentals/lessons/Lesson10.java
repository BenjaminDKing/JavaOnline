package com.fundamentals.lessons;

/*
* This class will go over the Lesson 10 content
* Access Modifiers
* */
public class Lesson10 {

    // This method demonstrates a use of the private access modifier
    private void myMethod() {
        System.out.println("myMethod is a private method.");
    } // End method myMethod

    // This method demonstrates a use of the default access modifier
    void myDefaultMethod() {
        System.out.println("Method from a default access modifier");
        System.out.println("The next statement comes from a private method");
        myMethod();
    } // End method myDefaultMethod

    // This method demonstrates the use of the protected access modifier
    protected void myProtectedMethod() {
        System.out.println("myProtected method is using the protected modifier");
    }  // End method myProtectedMethod

} // End Class
