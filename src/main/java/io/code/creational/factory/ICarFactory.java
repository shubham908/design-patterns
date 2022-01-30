package io.code.creational.factory;

public interface ICarFactory {
    
    Driveable create(String type);
}
