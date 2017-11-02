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
        for (Integer number: numbers) {
            System.out.println(number);
        }
        //When
        ArrayList<Integer> theNumbers = new ArrayList<Integer>();
        int j;
        for (j=2; j<10; j++) {
            if ((j%2) == 0) {
                theNumbers.add(j);
            }
        }
        for (Integer number: theNumbers) {
            System.out.println(number);
        }
        //Then
        Assert.assertNotEquals(theNumbers, numbers);

    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing normal list");
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        ext.exterminate(numbers);
        int i;
        for (i=1; i<10; i++) {
            numbers.add(i);
        }
        //When
        ArrayList<Integer> theNumbers = new ArrayList<Integer>();
        int j;
        for (j=2; j<10; j++) {
            if ((j%2) == 0) {
                theNumbers.add(j);
            }
        }
        for (Integer ANumber: theNumbers) {
            System.out.println(ANumber);
        }
        //Then
        Assert.assertNotEquals(theNumbers, numbers);
    }
}
