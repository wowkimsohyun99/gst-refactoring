package com.gst.refactoring.refuse_bequest.refactor_1;

public class CarRefactor {
    private Movable movable = new Movable();

    public void move() {
        movable.move();
    }

    public void manufacture() {
        System.out.println("manufacture car");
    }
}
