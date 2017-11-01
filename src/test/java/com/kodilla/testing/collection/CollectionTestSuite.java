package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Testing empty list");
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        int i;
        for (i=0; i<10; i++) {
            numbers.add(null);
        }
        //Then


    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing normal list");
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        int i;
        for (i=0; i<10; i++) {
            numbers.add(i);
        }
        for (Integer theNumber: evenNumbers)
            System.out.println(theNumber);
        //Then
    }
}
