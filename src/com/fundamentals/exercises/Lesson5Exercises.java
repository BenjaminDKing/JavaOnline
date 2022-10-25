package com.fundamentals.exercises;

public class Lesson5Exercises {

    public static void exercise1() {
        int decimal = 29;
        int hexidecimal = 0x1d;
        int binary = 0b11101;

        System.out.println("decimal: " + decimal);
        System.out.println("Hexidecimal: " + hexidecimal);
        System.out.println("Binary: " + binary);
    }

    public static void exercise2() {
        // Widening
        // byte to int (implicit)
        byte aByte = 1;
        int anInt = aByte;

        // short to long (explicit)
        short aShort = 16;
        long nowALong = (long)aShort;

        // int to float (implicit)
        int anotherInt = 5;
        float aFloat = anotherInt;

        System.out.println(anInt + " is of type: " + ((Object)anInt).getClass().getSimpleName());
        System.out.println(nowALong + " is of type: " + ((Object)nowALong).getClass().getSimpleName());
        System.out.println(aFloat + " is of type: " + ((Object)aFloat).getClass().getSimpleName());
    }

    public static void exercise3() {
        // Narrowing

        //double to long
        double num1 = 5.555;
        long num2 = (long)num1;

        //float to int
        float num3 = 7.0F;
        int num4 = (int)num3;

        //long to short
        long num5 = 3;
        short num6 = (short)num5;

        System.out.println(num2 + " is of type: " + ((Object)num2).getClass().getSimpleName());
        System.out.println(num4 + " is of type: " + ((Object)num4).getClass().getSimpleName());
        System.out.println(num6 + " is of type: " + ((Object)num6).getClass().getSimpleName());
    }
}
