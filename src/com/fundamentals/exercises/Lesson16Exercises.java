package com.fundamentals.exercises;

public class Lesson16Exercises {

    public enum MovieGenres { COMEDY, HORROR, ACTION, ROMANCE, DOCUMENTARY }

    public void famousMovie(MovieGenres genre) {
        switch (genre) {
            case COMEDY:
                System.out.println("Pineapple Express");
            case HORROR:
                System.out.println("The Shining");
            case ACTION:
                System.out.println("The Dark Knight");
            case ROMANCE:
                System.out.println("10 Things I Hate About You");
            case DOCUMENTARY:
                System.out.println("The Social Dilemma");
            break;
        }
    }
}
