package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for(Integer number: numbers) {
            if ((number % 2) == 0) {
                evenNumbers.add(number);
                numbers.remove(number);
            }
        }
        for (Integer theNumber: evenNumbers) {
            System.out.println(theNumber);
        }
        return evenNumbers;
    }
}
