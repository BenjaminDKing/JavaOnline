package com.fundamentals.lessons;

import com.fundamentals.CompanyInfo;
import com.fundamentals.House;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lesson19 {

    public void noLambda() {
        SomeInterface some = new SomeInterface() {
            @Override
            public void someRealMethod() {
                System.out.println("My real something");
            }
        };
        some.someRealMethod();
    }

    public void withLambda() {
        SomeInterface some2 = () -> {
            System.out.println("My true something");
        };
        some2.someRealMethod();
    }

    public void multipleLambda() {
        // Using parameter declaration
        SimpleAdditionInterface simple = (able, beta) -> (able + beta);
        System.out.println(simple.add(20, 30));

        // Using data type declaration
        SimpleAdditionInterface simple2 = (int alpha, int bravo) -> (alpha + bravo);
        System.out.println(simple2.add(10, 15));
    }

    public void listLambda() {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        list.forEach((value) -> System.out.println(value));
    }

    public void filterLambda() {
        ArrayList<House> houses = getHouseList();
        Stream<House> filterHouses =
                houses.stream().filter(myChoice -> myChoice.getDoorColor().equals("White"));
        filterHouses.forEach(house -> System.out.println("Selections: " + house.toString()));
    }

    /*
    * Include methods info for getting company info for less than 2k and greater than 2k
    * */
    public void queryInfo(ArrayList<CompanyInfo> company, Predicate<CompanyInfo> expr) {
        ArrayList<CompanyInfo> result = new ArrayList<>();
        for(CompanyInfo info : company) {
            if(expr.test(info)) {
                result.add(info);
            }
        }
        result.forEach(person -> System.out.println(person));
    }


    private ArrayList<House> getHouseList() {
        ArrayList<House> houseList = new ArrayList<>();
        houseList.add(new House());
        houseList.add(new House("Green"));
        houseList.add(new House("Dirt", "Straw", "Brown", 20));
        houseList.add(new House());
        houseList.add(new House("Red"));
        houseList.add(new House());
        houseList.add(new House("Steel", "Steel", "White", 30));
        houseList.add(new House("Blue"));
        houseList.add(new House());

        return houseList;
    }

    public static ArrayList<CompanyInfo> getInfo() {
        ArrayList<CompanyInfo> info = new ArrayList<>();
        info.add(new CompanyInfo(1000, "John"));
        info.add(new CompanyInfo(1100, "Jane"));
        info.add(new CompanyInfo(1200, "Debra"));
        info.add(new CompanyInfo(2000, "Paul"));
        info.add(new CompanyInfo(2100, "Mike"));
        info.add(new CompanyInfo(2200, "Amy"));
        info.add(new CompanyInfo(1300, "Kate"));
        info.add(new CompanyInfo(3000, "Joe"));
        info.add(new CompanyInfo(2230, "Alice"));
        info.add(new CompanyInfo(3300, "Bill"));

        return info;
    }

}
