package com.kodilla.testing.shape;

public class Square implements Shape{
    private double a;
    private double squareField = Math.pow(a,2);
    public void getShapeName(){
        System.out.println("This is a square");
    }
    public double getField(){
        return squareField;
    }
}
