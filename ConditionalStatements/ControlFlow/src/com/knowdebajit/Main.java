package com.knowdebajit;

public class Main {

    public static void main(String[] args) {

        byte a = 1;
        byte b = 1;
        byte c = 2;

        // Boolean Expression
        System.out.println(a == b);
        System.out.println(a == c);

        // Logical Operators
        final short temperature = 60;
        boolean iswarm = temperature >= 25;

        System.out.println(iswarm);

        // if statement
        int income = 5000;
        boolean criminalRecord = false;

        if(income > 3000 && !criminalRecord)
            System.out.println("Welcome You are Eligible for the Loan");
        else
            System.out.println("Sorry, You are not eligible");

        // Ternary Operator
        int salary = 6000;
        String className = (salary > 5000) ? "Premium" : "Economy";

        System.out.println("You are Flying in: " + className);


    }
}
