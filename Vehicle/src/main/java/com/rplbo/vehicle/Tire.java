package com.rplbo.vehicle;

public class Tire {
    private String tireType;
    private int width;
    private int aspectRatio;
    private int wheelDiameter;

    public Tire(String tireType, int width, int aspectRatio, int wheelDiameter){
        this.tireType=tireType;
        this.width=width;
        this.aspectRatio=aspectRatio;
        this.wheelDiameter=wheelDiameter;
    }

    public int getAspectRatio(){
        return aspectRatio;
    }

    public String getTireType() {
        return tireType;
    }

    public int getWheelDiameter(){
        return wheelDiameter;
    }

    public int getWidth(){
        return width;
    }

    public void setAspectRatio(int aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}