package io.code.creational.factory;

public class Automatic implements Driveable {

    public Automatic() {
        System.out.println("Automatic car created.");
    }

    @Override
    public void drive() {
        System.out.println("Automatic car going for a spin.");
    }
}
