package com.gst.refactoring.refuse_bequest.smell_1;

public class Animal {
    public String name;

    public void getName() {
        System.out.println(name);
    }

    public void move() {
        System.out.println("Run");
    }

    public void reproduction() {
        System.out.println("Lay baby");
    }
}
