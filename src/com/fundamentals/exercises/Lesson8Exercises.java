package com.fundamentals.exercises;

public class Lesson8Exercises {

    public void exercise1(String str1, String str2) {
        if(str1 == str2) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are NOT equal.");
        }
    }

    public String exercise2(char grade) {
        switch(grade) {
            // E, V, G, A, F
            case 'E':
            case 'e':
                return "Excellent";
            case 'V':
                return "Very Good";
            case 'G':
                return "Good";
            case 'A':
                return "Average";
            case 'F':
                return "Fail";
            default:
                return "Not a valid grade.";
        }
    }

    public void exercise3() {
        for(int i = 0; i <= 30; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
