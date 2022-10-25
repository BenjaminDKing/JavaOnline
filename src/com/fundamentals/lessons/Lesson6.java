package com.fundamentals.lessons;

/**
 * The contents of this class is for the lesson 6 Slide Deck
 * Strings & More
 */
public class Lesson6 {

    String myString = "Hello";

    // Method shows String method for charAt
    public void exampleCharAt() {
        char myChar = myString.charAt(2);
        System.out.println(myChar);
    } // End method exampleCharAt

    // Method compares two strings to see if they are equal
    public void exampleEquals(String value) {
        boolean myBoolean = myString.equals(value);
        System.out.println(myBoolean);
    } // End method exampleEquals

    // Method takes a string and converts it to all lowercase
    public String exampleLowercase() {
        return myString.toLowerCase();
    } // End method exampleLowercase

    // Method takes a string and converts it to all uppercase
    public String exampleUppercase() {
        return myString.toUpperCase();
    } // end method exampleUppercase

    // Method determines the length of a string
    public void exampleLength() {
        int length = myString.length();
        System.out.println(length);
    } // End method exampleLength

    // Example of how to use the StringBuilder class
    public void exampleBuilder(String food, int value) {
        StringBuilder builder = new StringBuilder();
        builder.append("My favorite food is ");
        builder.append(food).append(", and I ate ");
        builder.append(value).append(" plates of it");
        String fav = builder.toString();
        System.out.println(fav);
    } // End method exampleBuilder

    // Method for showing the char data type
    public void exampleChar() {
        char c1 = 't'; // \u0074
        char c2 = '\u00a7';
        System.out.println(c2);
    } // End method exampleChar

    // Method shows escape sequences
    public void exampleEscape() {
        System.out.println("That\'s a cool toy. \tCan I\n play with it?");
    } // End method exampleEscape
} // End class
