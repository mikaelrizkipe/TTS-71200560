package com.rplbo.vehicle;

public class Transmision {
    private String transType;
    private int numSpeed;

    public Transmision(String transType, int numSpeed){
        this.transType=transType;
        this.numSpeed=numSpeed;
    }

    public int getNumSpeed() {
        return numSpeed;
    }

    public String getTransType() {
        return transType;
    }

    public void setNumSpeed(int numSpeed) {
        this.numSpeed = numSpeed;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }
}