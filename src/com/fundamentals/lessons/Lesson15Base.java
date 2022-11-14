package com.fundamentals.lessons;

/*
* The following contents is covering Lesson 15
* Abstract
* */

public abstract class Lesson15Base implements Lesson15Interface {

    private int volume;
    private int[] numberKeys;
    private String screen;

    public Lesson15Base(int vol, int[] nKeys, String screen) {
        this.volume = vol;
        this.numberKeys = nKeys;
        this.screen = screen;
    }

    public int getVolume() {
        return volume;
    }

    public int[] getNumberKeys() {
        return numberKeys;
    }

    public String getScreen() {
        return screen;
    }

    public abstract void receiveCall();
    public abstract void sendCall();
    public abstract void endCall();


}
