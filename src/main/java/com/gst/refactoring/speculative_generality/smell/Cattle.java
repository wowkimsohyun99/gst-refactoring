package com.gst.refactoring.speculative_generality.smell;

public abstract class Cattle extends Animal {
    @Override
    public void eat(String time, String food, String extra_food) {
        super.eat(time, food, extra_food);
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void play() {
        super.play();
    }
}
