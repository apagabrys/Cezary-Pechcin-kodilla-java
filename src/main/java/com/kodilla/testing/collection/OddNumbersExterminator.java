package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        int i;
        for(i=2; i<10; i=i+2) {
            evenNumbers.add(i);
        }
        for (Integer theNumber: evenNumbers) {
            System.out.println(theNumber);
        }
        return evenNumbers;
    }
}
