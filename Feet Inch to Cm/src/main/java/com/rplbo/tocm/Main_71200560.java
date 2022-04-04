package com.rplbo.tocm;

public class Main_71200560 {
    public static double FeetIncToCm(int inch) {
        if (inch > 0) {
            System.out.println(inch + " inc = " + (inch / 12) + " feet " + (inch % 12) + " inc");
            return FeetIncToCm((inch / 12), (inch % 12));
        }
        else {
            return -1;
        }
    }

    public static double FeetIncToCm(double feet, double inch){
        if (feet > 0 && (inch > 0 || inch == 12)) {
            feet = feet * 12;
            inch = inch + feet;
            double cm = inch * 2.54;
            System.out.println("Nilai dalam centimeter: " + cm + " cm");
            return cm;
        }
        else {
            return -1;
        }
    }

    public static void main( String[] args ) {
        FeetIncToCm(1, 3);
        FeetIncToCm(15);
        System.out.println("======================================");
        FeetIncToCm(12, 5);
        FeetIncToCm(30);
    }
}
