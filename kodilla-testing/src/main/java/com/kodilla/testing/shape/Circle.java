package com.kodilla.testing.shape;

public class Circle implements Shape {
    @Override
    public void getShapeName() {
        System.out.println("This is a circle");
    }

    @Override
    public void getField() {
        System.out.println("Pi*r^2");
    }
}
