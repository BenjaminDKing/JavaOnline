package com.fundamentals;

public class Labrador extends Dog {

    private String name;
    private double weight;
    private String furColor;

    public Labrador() {
        System.out.println("Default Labrador constructor");
    }

    public Labrador(String name, double weight, String furColor) {
        super();
        this.furColor = furColor;
    }

    public void fetch(){
        String name = getName();
        System.out.println(name + " fetched something!");
    }

    @Override
    public void bark() {
        super.bark();
        System.out.println(name + " the labrador barked.");
    }

    public void bark(String volume){
        System.out.println(name + " the labrador barked " + volume);
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setWeight(double weight) { this.weight = weight; }

    public double getWeight() { return weight; }

    public void setFurColor(String furColor) { this.furColor = furColor; }

    public String getFurColor() { return furColor; }

}
