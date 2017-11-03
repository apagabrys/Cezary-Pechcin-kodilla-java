package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.awt.image.AreaAveragingScaleFilter;
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
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> noNumbers = new ArrayList<Integer>();
        ArrayList<Integer> expectedNumbers = new ArrayList<Integer>();
        int j;
        for (j=2; j<10; j=j+2) {
            expectedNumbers.add(j);
        }
        //When
        ArrayList<Integer> resultNumbers = exterminator.exterminate(ArayList<Integer> noNumbers);
        //Then
        Assert.assertEquals(expectedNumbers; resultNumbers);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing normal list");
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> allNumbers = new ArrayList<Integer>();
        int i;
        for (i=1; i<10; i++) {
            allNumbers.add(i);
        }
        ArrayList<Integer> expectedNumbers = new ArrayList<Integer>();
        int j;
        for (j=2; j<10; j=j+2) {
            expectedNumbers.add(j);
        }
        //When
        ArrayList<Integer> resultNumbers = exterminator.exterminate(ArayList<Integer> allNumbers);
        //Then
        Assert.assertEquals(expectedNumbers; resultNumbers);
    }
}
