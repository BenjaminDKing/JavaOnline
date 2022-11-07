package com.fundamentals.exercises;

public class Television {

    private int screenSize;
    private double price;
    private int ports;
    private boolean isMountable;

    public void turnOn() {
        System.out.println("The TV is turned on.");
    }

    // Constructors
    public Television(int screenSize, double price) {
        this(screenSize, price, 8, true);
        System.out.println("The screen size is " + screenSize + "\", and the price is $" + price + ".");
    }

    public Television(int screenSize, double price, int ports, boolean isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.ports = ports;
        this.isMountable = isMountable;
    }

    // Getters and Setters
    public void setScreenSize(int screenSize) { this.screenSize = screenSize; }

    public int getScreenSize() { return screenSize; }

    public void setPrice( double price ) { this.price = price; }

    public double getPrice() { return price; }

    public void setPorts( int ports ) { this.ports = ports; }

    public int getPorts() { return ports; }

    public void setIsMountable( boolean isMountable ) { this.isMountable = isMountable; }

    public boolean getIsMountable() { return isMountable; }

}
