package com.rplbo.vehicle;

public class Truck extends MotorVehicle {
    private int capacity;

    public Truck(Engine engine, Transmision transmision, Tire tire, Wheel wheel, int capacity) {
        super(engine, tire, wheel, transmision);
        this.capacity = capacity;
    }

    @Override
    public void backward() {
    }

    @Override
    public void brake() {
    }

    @Override
    public void forward() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void turnLeft() {
    }

    @Override
    public void turnRight() {
    }
}