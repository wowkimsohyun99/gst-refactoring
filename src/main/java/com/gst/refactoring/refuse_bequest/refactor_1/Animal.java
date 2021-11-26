package com.gst.refactoring.refuse_bequest.refactor_1;

public class Animal {
    public String name;
    public Movable movable = new Movable();

    public void move(){
        movable.move();
    }

    public void reproduction() {
        System.out.println("Lay baby");
    }
}
