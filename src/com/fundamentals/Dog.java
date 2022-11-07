package com.fundamentals;

public class Dog {

    private int numberOfLegs;
    private String breed;
    private int age;

    // Constructors:
    public Dog() {
        //this("Boxer");
        System.out.println("Default constructor.");
    }

    public Dog(String breed) {
        this(4, breed, 7);
        System.out.println("The dog is a " + breed);
    }

    public Dog(int numberOfLegs, String breed, int age) {
        this.numberOfLegs = numberOfLegs;
        this.breed = breed;
        this.age = age;
    }

    // Getters and Setters:
    public void setNumberOfLegs(int numberOfLegs) { this.numberOfLegs = numberOfLegs;}

    public int getNumberOfLegs() { return numberOfLegs; }

    public void setBreed(String breed) { this.breed = breed; }

    public String getBreed() { return breed; }

    public void setAge( int age ) { this.age = age; }

    public int getAge() { return age; }

}