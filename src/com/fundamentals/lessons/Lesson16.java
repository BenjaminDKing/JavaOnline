package com.fundamentals.lessons;

import com.fundamentals.DaysOfTheWeek;

/*
* This class is used for Lesson 16 content
* Enumerations
* */
public class Lesson16 {

    public enum IceCreamFlavors { VANILLA, CHOCOLATE, STRAWBERRY, ROCKY_ROAD }

    public void showEnums() {
        DaysOfTheWeek d1 = DaysOfTheWeek.TUE;
        System.out.println(d1);

        System.out.println(IceCreamFlavors.CHOCOLATE);
        System.out.println(DaysOfTheWeek.FRI);
    }

    public void myFavoriteFlavor(IceCreamFlavors flavors) {
        String message = "My favorite flavor is ";
        switch (flavors) {
            case VANILLA:
                message += "vanilla.";
            case CHOCOLATE:
                message += "chocolate.";
            case STRAWBERRY:
                message += "strawberry.";
            default:
                message += "rocky road.";
                break;
        }
        System.out.println(message);
    }
}
