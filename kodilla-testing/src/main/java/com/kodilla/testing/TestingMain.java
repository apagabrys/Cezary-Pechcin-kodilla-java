package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("User test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator  = new Calculator();
            int sum = calculator.addAToB(192,102);
            int difference = calculator.subtractBFromA(192,102);

            if ((sum == 294) && (difference == 90)) {
            System.out.println("Calculator test OK");
            } else {
            System.out.println("Error!");
            }

    }
}
