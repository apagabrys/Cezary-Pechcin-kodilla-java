package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator  = new Calculator();
            int sum = calculator.addAToB(5,5);
            int divide = calculator.substractAFromB(192,41);
            System.out.println("a + b = " + sum);
            System.out.println("c - d = " + divide);

    }
}
