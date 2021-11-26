package com.gst.refactoring.speculative_generality.refactored;

import java.time.LocalDateTime;

public abstract class Animal {
    private String gender;
    private LocalDateTime farmingStartTime;
    private Double weight;

    public void eat(String time, String food) {
        System.out.println("eat at:  " + time);
        System.out.println("eat food:  " + food);
    }

    public void drink() {
        System.out.println("drink at 6am");
    }
}
