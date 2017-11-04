//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.kodilla.testing.collection;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CollectionTestSuite {
    public CollectionTestSuite() {
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
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
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> noNumbers = new ArrayList();
        ArrayList<Integer> expectedNumbers = new ArrayList();
        ArrayList<Integer> resultNumbers = exterminator.exterminate(noNumbers);
        Assert.assertEquals(expectedNumbers, resultNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing normal list");
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> allNumbers = new ArrayList();

        for(int i = 1; i < 10; ++i) {
            allNumbers.add(i);
        }

        ArrayList<Integer> expectedNumbers = new ArrayList();

        for(int j = 2; j < 10; j += 2) {
            expectedNumbers.add(j);
        }

        ArrayList<Integer> resultNumbers = exterminator.exterminate(allNumbers);
        Assert.assertEquals(expectedNumbers, resultNumbers);
    }
}
