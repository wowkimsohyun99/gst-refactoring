package com.gst.refactoring.speculative_generality.smell;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cow extends Cattle{
    @Override
    public void eat(String time, String food, String extra_food) {
        System.out.println("eat at:  " + time);
        System.out.println("eat food:  " + food);
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
