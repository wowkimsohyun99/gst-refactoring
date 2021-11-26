package com.gst.refactoring.refuse_bequest.refactor_1;

public class CowsRefactor extends Animal {
    public CowsRefactor() {
        name = "Cows";
    }

    @Override
    public void reproduction() {
        System.out.println("Lay baby.");
    }
}
