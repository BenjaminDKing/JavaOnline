package com.fundamentals.exercises;
import com.fundamentals.House;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson17Exercises {

    public void televisions() {
        List<Television> myTelevisions = new ArrayList<Television>();
        myTelevisions.add(new Television(42, 150.0));
        myTelevisions.add(new Television(55, 250));
        myTelevisions.add(new Television(72, 500));

        for(int i = 0; i < myTelevisions.size(); i++) {
            System.out.println("Screen: " +  myTelevisions.get(i).getScreenSize());
            System.out.println(" Price: " + "$" + myTelevisions.get(i).getPrice());
        }
    }

    public void houses() {
        Map<Integer, House> myHouses = new HashMap<>();
        myHouses.put(0, new House("Grey"));
        myHouses.put(1, new House("Navy Blue"));
        myHouses.put(2, new House());

        for(Map.Entry<Integer, House> house : myHouses.entrySet()) {
            System.out.println(house.getKey() + " : " + house.getValue().getDoorColor());
        }
    }
}
