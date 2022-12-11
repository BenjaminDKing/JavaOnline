package com.fundamentals;
import com.fundamentals.lessons.*;
import com.fundamentals.exercises.*;

/*
* This Main class is the entry point to the application
* */
public class Main {

    public static int num = 0;

//    static {
//        System.out.println("Static block 1");
//        num = 42;
//    }
//
//    static {
//        System.out.println("Static block 2");
//        num = 52;
//    }

    public static void main(String[] args) {
        // This prints "Hello, Java!"
        //System.out.println("Hello, Java!");

        //House myHouse = new House();
        //lesson5Examples();
        //exercise5Example();
        //lesson6Examples();
        //exercise6Example();
        //lesson7Examples();
        //exercise7Example();
        //lesson8Examples();
        //exercise8Example();
        //lesson9Examples();
        //exercise9Example();
        //lesson10Examples();
        //lesson11Examples();
        //televisionExample();
        //inheritanceExample();
        //lesson13Examples();
        //lesson14Examples();
        //exercise14Example();
        //lesson15Examples();
        //exercise15Example();
        //lesson16Examples();
        //exercise16Example();
        //lesson17Examples();
        //exercise17Example();
        //lesson18Examples();
        //exercise18Example();
        //exerciseDateTime();
        lesson19Example();


    } // End main method

    public static void lesson5Examples() {
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10, 15);
        int value = myLesson5.showLocalWithReturn(25, 19);
        System.out.println(value);
        System.out.println(myLesson5.showLocalWithReturn(5, 8));
        myLesson5.showInstanceVariable();
        myLesson5.showConversions();

    } // End lesson5Examples method

    public static void exercise5Example() {
        Lesson5Exercises myExercises = new Lesson5Exercises();
        myExercises.exercise1();
        myExercises.exercise2();
        myExercises.exercise3();
    }

    public static void lesson6Examples() {
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleEquals("Happy");
        String myStr1 = myLesson6.exampleLowercase();
        System.out.println(myStr1);
        System.out.println(myLesson6.exampleUppercase());
        myLesson6.exampleLength();
        myLesson6.exampleBuilder("pizza", 3);
        myLesson6.exampleChar();
        myLesson6.exampleEscape();
    } // End method lesson6Examples

    public static void exercise6Example() {
        Lesson6Exercises myExercises6 = new Lesson6Exercises();
        myExercises6.exercise1("IS THIS LOWERCASE?");
        myExercises6.exercise2();
        myExercises6.exercise3();
    }

    public static void lesson7Examples() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        // myLesson7.addTwoNumber();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();
    }

    public static void exercise7Example() {
        Lesson7Exercises myExercises7 = new Lesson7Exercises();
        myExercises7.modulus(361);
        myExercises7.assignmentOperators(15, 13);
        myExercises7.pemdasExample();
    }

    public static void lesson8Examples() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,5);
        myLesson8.basicIfElseExample(12, 17);
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(108);
        myLesson8.basicSwitchExample(2);
        myLesson8.basicWhileExample();
        myLesson8.basicDoWhileExample();
        myLesson8.basicForLoopExample();
        myLesson8.basicBranchExample();
    }

    public static void exercise8Example() {
        Lesson8Exercises myExercises8 = new Lesson8Exercises();
        myExercises8.exercise1("A String", "A String");
        myExercises8.exercise1("A String", "A different string");
        System.out.println(myExercises8.exercise2('A'));
        System.out.println(myExercises8.exercise2('Z'));
        myExercises8.exercise3();
    }

    public static void lesson9Examples() {
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();
    }

    public static void exercise9Example() {
        Lesson9Exercises myExercises9 = new Lesson9Exercises();
        myExercises9.exercise1();
        myExercises9.exercise2();
    }

    public static void lesson10Examples() {
        Lesson10 myLesson10 = new Lesson10();
        //myLesson10.myMethod();
        Lesson10Extended myExtended = new Lesson10Extended();
        //myLesson10.myDefaultMethod(); method is default and outside this package
        myExtended.methodFromOtherClass();
        //myLesson10.myProtectedMethod(); method is protected and is not subclassed and outside this package
    } // End method lesson10Examples

    public static void lesson11Examples() {
        House myHouse = new House();
        House myOtherHouse = new House("Red");

        Dog myDog = new Dog();
        Dog anotherDog = new Dog("Bichon Frise");
    }

    public  static void televisionExample() {
        Television myTelevision = new Television(42, 199.98);
        Television myOtherTelevision = new Television(55, 150, 10, true);
        myOtherTelevision.turnOn();
    }

    public static void inheritanceExample() {
        Labrador myLab = new Labrador(4, "Labrador", 10, "Jeff", 78.6, "Gold");
        myLab.fetch();
    }

    public static void lesson13Examples() {
        House myHouse = new House("blue");
        Condo myCondo = new Condo("medium");
        myHouse.doorOpenClose(myHouse.getDoorColor());
        myCondo.doorOpenClose(myCondo.getDoorColor());

        Dog genericDog = new Dog();
        Labrador myLab = new Labrador(4, "Labrador", 11, "Jeff", 87.1, "Black");

        genericDog.bark();
        myLab.bark();
        myLab.bark("Loudly");
        myLab.fetch();

        House myNewHouse = new Condo();
        myNewHouse.doorOpenClose();
    }

    public static void lesson14Examples() {
        // Cannot change value of a final
        //Lesson14.MY_FIRST_FINAL = 10;

        int total = Lesson14.MY_FIRST_FINAL * 35; // 2145 * 35
        System.out.println(total);

        // Can change the value of a non-final static
        Lesson14.myFirstStatic = 98; // Original value was 25
        System.out.println(Lesson14.myFirstStatic);

        Lesson14.myFirstStaticMethod(10);

        System.out.println("Block number was " + num);
    }

    public static void exercise14Example() {
        final double VOLTAGE = 1000;
        final double CURRENT = 5;
        final double RESISTANCE = 200;

        Lesson14Exercises myExercises14 = new Lesson14Exercises();
        System.out.println("Voltage: " + myExercises14.voltage(CURRENT, RESISTANCE));
        System.out.println("Current: " + myExercises14.current(VOLTAGE, RESISTANCE));
        System.out.println("Resistance: " + myExercises14.resistance(VOLTAGE, CURRENT));
    }

    public static void lesson15Examples() {
        int[] myInt = {1, 2, 3, 4};
        Lesson15Base myBase = new Lesson15Sub(10, myInt, "turned off");
        Lesson15Sub mySub = new Lesson15Sub(10, myInt, "turned on");
        mySub.receiveCall();
        mySub.takePicture();
    }

    public static void exercise15Example() {
        WaterBirds mySwan = new Swan();
        WaterBirds myDuck = new Duck();

        mySwan.forward();
        mySwan.backward();
        mySwan.standStill();

        myDuck.forward();
        myDuck.backward();
        myDuck.standStill();
    }

    public static void lesson16Examples() {
        Lesson16 myLesson16 = new Lesson16();
        myLesson16.showEnums();
        myLesson16.myFavoriteFlavor(Lesson16.IceCreamFlavors.ROCKY_ROAD);

        DaysOfTheWeek d1[] = DaysOfTheWeek.values();
        for(DaysOfTheWeek day: d1) {
            System.out.println(day + " at index " + day.ordinal());
        }

        DaysOfTheWeek d3 = DaysOfTheWeek.WED;
        d3.enumMethod();

        Lesson16Lab[] labs = Lesson16Lab.values();

        for(Lesson16Lab lab : labs) {
            System.out.println("Labrador Color: " + lab.name() + " registration code: " +
                    lab.getAction());
        }
    }

    public static void exercise16Example() {
        Lesson16Exercises myExercise16 = new Lesson16Exercises();
        myExercise16.famousMovie(Lesson16Exercises.MovieGenres.DOCUMENTARY);
    }

    public static void lesson17Examples() {
        Lesson17 myLesson17 = new Lesson17();
        myLesson17.exampleArrayList1();
        myLesson17.exampleArrayList2();
        myLesson17.exampleHashSet();
        myLesson17.exampleHashMap();
    }

    public static void exercise17Example() {
        Lesson17Exercises myExercise17 = new Lesson17Exercises();
        myExercise17.televisions();
        myExercise17.houses();
    }

    public static void lesson18Examples() {
        Lesson18 myLesson18 = new Lesson18();
        myLesson18.exampleException();
        myLesson18.myArrayException();
    }

    public static void exercise18Example() {
        Lesson18Exercises myExercises18 = new Lesson18Exercises();
        myExercises18.isLeapYear();
    }

    public static void exerciseDateTime() {
        MyCalendarData myCalendar = new MyCalendarData();
        //myCalendar.localDateTimeExamples();
        //myCalendar.epochExample();
        //myCalendar.localDateExample();
        //myCalendar.localTimeExample();
        //myCalendar.formatDateTimeExample();
        myCalendar.timePeriodExample();
    }

    public static void lesson19Example() {
        Lesson19 nineteen = new Lesson19();
        //nineteen.noLambda();
        //nineteen.withLambda();
        //nineteen.multipleLambda();
        //nineteen.listLambda();
        //nineteen.filterLambda();
        nineteen.queryInfo(Lesson19.getInfo(), (id -> id.getName() == "Bill"));
    }

} // End class
