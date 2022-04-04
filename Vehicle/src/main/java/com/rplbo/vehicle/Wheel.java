package com.rplbo.vehicle;

public class Wheel {
    private int width;
    private int diameter;

    public Wheel(int width, int diameter){
        this.width=width;
        this.diameter=diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getWidth() {
        return width;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setWidht(int width) {
        this.width = width;
    }
}