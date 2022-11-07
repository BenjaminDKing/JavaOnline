package com.fundamentals;

public class Labrador extends Dog {

    private String name;
    private double weight;
    private String furColor;

    public Labrador() {
        System.out.println("Default Labrador constructor");
    }

    public Labrador(String name, double weight, String furColor) {
        this.name = name;
        this.weight = weight;
        this.furColor = furColor;
    }

    public void fetch(){
        String name = getName();
        System.out.println(name + " fetched something!");
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setWeight(double weight) { this.weight = weight; }

    public double getWeight() { return weight; }

    public void setFurColor(String furColor) { this.furColor = furColor; }

    public String getFurColor() { return furColor; }

}
