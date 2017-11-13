package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }
    public void addFigure(){

    }
    public boolean removeFigure(){
        return true;
    }
    public Square getFigure(int n){
        return null;
    }
    public void showFigures(){
        this.shape.getShapeName();
    }
    public int getShapesQuantity(){
        return 1;
    }
}
