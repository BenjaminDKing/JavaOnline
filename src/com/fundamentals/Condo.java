package com.fundamentals;

/*
* This class is a subclass of House
* Part of lesson 12 and lesson 13
* */

public class Condo extends House {

    private String balcony;

    public Condo() {
        System.out.println("Default Condo constructor");
    }

    public Condo(String balcony) {
        this(balcony, "red", 25, "concrete", "shingles");
        //this.balcony = balcony;
    }

    public Condo(String balcony, String doorColor, int windowSize, String foundation, String roofType ){
        super(foundation, roofType, doorColor, windowSize);
        this.balcony = balcony;
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    public void maintenance() {
        System.out.println("Will fix Condo issues");
    }

    @Override
    public void doorOpenClose() {
        super.doorOpenClose();
        System.out.println("My condo door is open.");
    }

    @Override
    public void doorOpenClose(String doorColor) {
        System.out.println("The condo door is " + doorColor);
    }

}
