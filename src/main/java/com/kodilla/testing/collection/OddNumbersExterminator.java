package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for(int i:numbers) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}
