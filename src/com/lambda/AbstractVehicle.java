package com.lambda;

public abstract class AbstractVehicle {
    // Abstract class means we can't instantiate this class, with like new something, like before.
    // Because you can't instantiate an abstract class. So you just give guidance to vehicle classes.
    int fuel;

    public AbstractVehicle(int fuel) {
        this.fuel = fuel;
    }

    public AbstractVehicle() {
        fuel = 1;
    }

    public abstract String getPath();
    public abstract String getName();

    public void move() {
        fuel--;
    }

    public void move(int steps) {
        fuel -= steps;
    }

    public int getFuelLevel() {
        return fuel;
    }

    public void addFuel(int i) {
        fuel += i;
    }

}
