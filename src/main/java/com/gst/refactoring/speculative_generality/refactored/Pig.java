package com.gst.refactoring.speculative_generality.refactored;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pig extends Animal {
    @Override
    public void eat(String time, String food) {
        super.eat(time, food);
    }

    @Override
    public void drink() {
        super.drink();
    }
}
