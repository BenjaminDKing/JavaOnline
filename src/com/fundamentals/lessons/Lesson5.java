package com.fundamentals.lessons;

/*
* The contents of this class is for the lesson 5 slide deck
* Primitive Data Types and More
* */
public class Lesson5 {

    // This primitive type can be true or false only
    boolean myBoolean = true;

    // This primitive type has a value of 0 to 65535
    char myChar = 'C';

    // This primitive type has a value range of -128 to 127
    byte myByte = 9;

    // This primitive type has a value range of -32768 to 32767
    short myShort = 235;

    /* This primitive type has a value range of
    -2,147,483,648 to 2,147,483,647 */
    int myInt = 2354;

    /* This primitive type has a value range of
     -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 */
    long myLong = 56864L;

    // This primitive type has a value range of 3.4E-038 to 3.4E+038
    float myFloat = 34.53F;

    // This primitive type has a value range of 1.7E-308 to 1.7E+308
    double myDouble = 36.43D;
    double myOtherDouble = 234.5;

    // Decimal value of 26
    int value = 26;

    // Hexadecimal value of 26
    int value2 = 0x1a;

    // Binary value of 26;
    int value3 = 0b11010;

    // Scientific Notation uses E or e
    double d2 = 23.65E8;

    // Using underscores to make the numbers readable
    long value5 = 4_568_987_367L;

    // This method shows a local variable
    public void showLocalExample() {
        int able = 20;
        System.out.println(able);
        value = 42;
    }

    // This method has 2 parameters separated by a comma
    public void showLocalWithParameter(int able, int vals) {
        int total = able + vals;
        System.out.println(total);
    }

    // This method has 2 parameters and a return type
    public int showLocalWithReturn(int type1, int type2) {
        return type1 + type2;
    }

    // This method shows Instance Variable that changes value inside the method
    public void showInstanceVariable() {
        System.out.println("Before: ");
        System.out.println(myDouble);
        System.out.println("After: ");
        myDouble = 98.6; // myDouble = 84.98 original value
        System.out.println(myDouble);
    }

    // This method shows implicit and explicit conversions
    public void showConversions() {
        long example1 = myInt; // implicit or widening conversion
        int example2 = (int)myLong; // explicit or narrowing conversion
        int example3 = (int)myDouble; // explicit or narrowing conversion
        System.out.println(example3); // Double value was 98.6 or 84.98
        int example4 = (int)value5; // explicit or narrowing conversion
        System.out.println(example4);
    }
}
