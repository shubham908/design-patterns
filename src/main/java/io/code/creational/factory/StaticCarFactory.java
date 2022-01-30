package io.code.creational.factory;

public class StaticCarFactory {

    /*
        This is a standalone class with a static method to help
        in the creation of Driveable types. This is not a Design Pattern.
     */
    public static Driveable createCar(String type) {
        switch (type) {
            case "AUTOMATIC":
                return new Automatic();
            default:
                return new Manual();
        }
    }
}
