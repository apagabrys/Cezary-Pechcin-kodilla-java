package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.ShapeCollector;

//Test suite for classes of Forum
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        ShapeCollector shape1 = new ShapeCollector(square);
        ShapeCollector shape2 = new ShapeCollector(triangle);
        ShapeCollector shape3 = new ShapeCollector(circle);
        //When
        shape1.addFigure();
        shape2.addFigure();
        shape3.addFigure();
        //Then
        Assert.assertEquals(3, shape3.getShapesQuantity());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape square = new Square();
        ShapeCollector shape1 = new ShapeCollector(square);
        shape1.addFigure();
        //When
        boolean result = shape1.removeFigure();
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shape1.getShapesQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape square = new Square();
        ShapeCollector shape1 = new ShapeCollector(square);
        shape1.addFigure();
        //When
        ShapeCollector retrievedShape;
        retrievedShape = shape1.getFigure(0);
        //Then
        Assert.assertEquals();

    }

    @Test
    public void testShowFigures(){
        //Given
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        ShapeCollector shape1 = new ShapeCollector(square);
        ShapeCollector shape2 = new ShapeCollector(triangle);
        ShapeCollector shape3 = new ShapeCollector(circle);
        //When
        String result1 = shape1.showFigures();
        String expected = "This is a square";
        //Then
        Assert.assertEquals(expected, result1);
    }
}

