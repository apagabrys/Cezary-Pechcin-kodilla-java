package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }
    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public boolean removeFigure(){
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
        shape = shapes.get(n);
        return shape;
    }
    public String showFigures(){
       String name = shape.toString();
       return name;
    }
    public int getShapesQuantity(){
        int quantity = shapes.size();
        return quantity;
    }
}
