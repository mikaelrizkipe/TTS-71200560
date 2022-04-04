package com.rplbo.vehicle;

public abstract class MotorVehicle implements Vehicle {
    private String vehicleName;
    private Engine engine;
    private Tire tire;
    private Wheel wheel;
    private Transmision transmision;

    public MotorVehicle(Engine engine, Tire tire, Wheel wheel, Transmision transmision){
        this.engine=engine;
        this.tire=tire;
        this.wheel=wheel;
        this.transmision=transmision;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tire getTire(){
        return tire;
    }

    public Transmision getTransmition(){
        return transmision;
    }

    public String getVehicleName(){
        return vehicleName;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}