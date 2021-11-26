package com.gst.refactoring.refuse_bequest.refactor_2;

public class Animal extends Things{
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
