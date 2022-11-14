package com.fundamentals.lessons;

/*
* This class demonstrates a subclass of an Abstract class
* */
public class Lesson15Sub extends Lesson15Base {

    public Lesson15Sub(int volume, int[] keys, String screen) {
        super(volume, keys, screen);
    }

    @Override
    public void receiveCall() {
        System.out.println("Received a call");
    }

    @Override
    public void sendCall() {
        System.out.println("Sent a call");
    }

    @Override
    public void endCall() {
        System.out.println("Ended a call");
    }

    @Override
    public void takePicture() { System.out.println("Picture Taken"); }
}
