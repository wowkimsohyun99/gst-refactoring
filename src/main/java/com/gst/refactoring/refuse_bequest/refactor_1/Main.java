package com.gst.refactoring.refuse_bequest.refactor_1;


public class Main {
    public static void main(String[] args) {
        System.out.println(" ----- COWS ----- ");
        CowsRefactor cowsRefactor = new CowsRefactor();
        cowsRefactor.move();
        cowsRefactor.reproduction();
        System.out.println(" ----- CAR ----- ");
        CarRefactor carRefactor = new CarRefactor();
        carRefactor.move();
        carRefactor.manufacture();
    }
}
