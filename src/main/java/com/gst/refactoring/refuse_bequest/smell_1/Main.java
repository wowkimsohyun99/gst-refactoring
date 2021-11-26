package com.gst.refactoring.refuse_bequest.smell_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ----- COWS ----- ");
        Cows cows = new Cows();
        cows.getName();
        cows.move();
        cows.reproduction();
        System.out.println(" ----- CAR ----- ");
        Car car = new Car();
        car.move();
        car.reproduction();
    }
}
