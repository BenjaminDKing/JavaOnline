package com.fundamentals.lessons;

/*
* This enum shows values with enum
* */

public enum Lesson16Lab {
    BLACK("007"), CHOCOLATE("071"), YELLOW("232");

    private String action;
    public String getAction() { return this.action; }

    private Lesson16Lab(String action) {
        this.action = action;
    }
}

