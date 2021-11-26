package com.gst.refactoring.speculative_generality.refactored;

public class Chicken extends Animal {
    @Override
    public void eat(String time, String food) {
        super.eat(time, food);
    }

    @Override
    public void drink() {
        super.drink();
    }

    public void play() {
        System.out.println("Chicken play lalala.");
    }
}
