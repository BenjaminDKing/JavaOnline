package com.fundamentals.lessons;

/* The contents of this class is for Lesson 9
* Arrays
* */

public class Lesson9 {


    // this method shows a basic single dimension array
    public void basicIntArray() {
        int[] intArray = {23, 45, 12, 8, 95, 103, 37};
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        } // End for loop
    } // End method basicIntArray

    // This method shows a multi-dimensional array 2D
    public void basicTwoDimensionalArray() {
        int[][] myArray = {{23, 45}, {35, 46}};
        for(int i = 0; i < myArray.length; i++) {
            for(int m = 0; m < myArray[i].length; m++) {
                System.out.println(myArray[i][m]);
            } // End inner for loop
        } // End outer for loop
    } // End method basicTwoDimensionalArray

    // This method shows a 3D array
    public void basicThreeDimensionalArray() {
        int[][][] arr = new int[2][2][2];
        arr[0][0][0] = 10;
        arr[0][1][0] = 12;
        arr[0][0][1] = 13;
        arr[0][1][1] = 14;

        arr[1][0][0] = 15;
        arr[1][1][0] = 16;
        arr[1][0][1] = 17;
        arr[1][1][1] = 18;

        for(int i = 0; i < arr.length; i++) {
            for(int k = 0; k < arr[i].length; k++) {
                for(int m = 0; m < arr[k].length; m++) {
                    System.out.println(arr[i][k][m]);
                } // End inner-inner for loop
            } // End inner for loop
        } // End outer for loop
    } // end method basicThreeDimensionalArray

    // This method demonstrates a jagged array
    public void basicJaggedArray() {
        String[][] stringArray = new String[1][3];
        stringArray[0][0] = "June";
        stringArray[0][1] = "July";
        stringArray[0][2] = "August";
        for(int i = 0; i < stringArray.length; i++) {
            for(int k = 0; k < stringArray[i].length; k++) {
                System.out.println(stringArray[i][k]);
            } // End inner for loop
        } // End outer for loop
    }
} // End Class
