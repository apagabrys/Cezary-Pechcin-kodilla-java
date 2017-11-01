package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double radius;
    private double circleField = Math.PI * Math.pow(radius,2);
    public void getShapeName() {
        System.out.println("This is a circle");
    }
    public double getField(){
        return circleField;
    }
}
