package io.code.creational.factory;

public class Main {

    public static void main(String[] args) {

        // Since we are not sure about which car to instantiate beforehand
        // so, we should go for a FactoryMethodPattern
        // Driveable car = new Automatic();
        ICarFactory carFactory = new ConcreteCarFactory();
        Driveable car = carFactory.create("MANUAL");
        car.drive();
    }
}
