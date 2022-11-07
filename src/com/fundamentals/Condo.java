package com.fundamentals;

/*
* This class is a subclass of House
* Part of lesson 12
* */

public class Condo extends House {

    private String balcony;

    public Condo() {
        System.out.println("Default Condo constructor");
    }

    public Condo(String balcony) {
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
}
