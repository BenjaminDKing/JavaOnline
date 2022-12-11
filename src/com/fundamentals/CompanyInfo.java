package com.fundamentals;

public class CompanyInfo {
    private int id;
    private String name;
    static String company = "Your Company";
    static final String ADDRESS = "123 Main St";

    public CompanyInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
