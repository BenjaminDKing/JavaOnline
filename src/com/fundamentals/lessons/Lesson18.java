package com.fundamentals.lessons;
import com.fundamentals.House;

/*
* The class content is for Lesson 18
* Exceptions and Exception Handling
* */
public class Lesson18 {
    String myString;
    House myHouse;
    // This method will show a basic try/catch/finally block
    public void exampleException() {
        try {
            System.out.println(myHouse.equals(myString));
            System.out.println("Try block ran");
        } catch (NullPointerException e) {
            System.out.println("Null Exception thrown " + e.getMessage());
        } finally {
            System.out.println("Finally block called");
        } // End try/catch/finally
    } // End method exampleException

    // This method will show a try with multiple catches and a finally
    public void myArrayException() {
        String[] names = {"Dave", "Matt", "Jody"};
        String[] values = {"24", "42", "38"};
        int hmm = Integer.MAX_VALUE;

        try {
            byte b = Byte.parseByte(values[1]);
            int total = Math.addExact(b, hmm);
            System.out.println(total);
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least one argument");
        } catch(NumberFormatException nf) {
            System.out.println("That is not a number");
        } catch (ArithmeticException ae) {
            System.out.println("You have given me more than I need");
        } catch(Exception e) {
            System.out.println("I don't know what you did " + e.toString());
        } finally {
            System.out.println("Finally my number didn't work");
        } // End try/catch/finally
    } // End method myArrayException
}
