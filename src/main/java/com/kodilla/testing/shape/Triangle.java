package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double a;
    private double h;
    private double triangleField = (a*h)/2;
    public void getShapeName(){
        System.out.println("This is a triangle");
    }
    public double getField(){
        return triangleField;
    }
}
