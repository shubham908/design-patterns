package io.code.creational.factory;

public class Manual implements Driveable {

    public Manual() {
        System.out.println("Manual car created.");
    }

    @Override
    public void drive() {
        System.out.println("Manual car going for a spin.");
    }
}
