package com.gst.refactoring.refuse_bequest.refactor_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ----- COWS ----- ");
        Cows cows = new Cows();
        cows.getName();
        cows.move();
        cows.reproduction();
        System.out.println(" ----- CAR ----- ");
        Car car = new Car();
        car.getName();
        car.move();
        car.manufacture();
    }
}
