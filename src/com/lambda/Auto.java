package com.lambda;

public class Auto extends AbstractVehicle {
    // Multiple classes can inherit form the same abstract class.

    private String model;
    public Auto(String model, int fuel) {
        super(fuel);
        this.model = model;
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public String getName() {
        return model;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                '}';
    }
}
