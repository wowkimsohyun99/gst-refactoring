package com.gst.refactoring.speculative_generality.smell;

import java.time.LocalDateTime;

public abstract class Animal {
    private String name;
    private String gender;
    private LocalDateTime farmingStartTime;
    private Double weight;

    public void eat(String time, String food, String extra_food) {
        System.out.println("eat at:  " + time);
        System.out.println("eat food:  " + food);
    }

    public void drink() {
        System.out.println("drink at 6am");
    }

    public void play() {
        System.out.println("drink at 8am");
    }
}
