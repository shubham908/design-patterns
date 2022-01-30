package io.code.creational.factory;

public class ConcreteCarFactory implements ICarFactory {

    @Override
    public Driveable create(String type) {
        switch (type) {
            case "AUTOMATIC":
                return new Automatic();
            default:
                return new Manual();
        }
    }
}
