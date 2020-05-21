package com.knowdebajit;

public class Main {

    public static void main(String[] args) {

        // Explicit Casting
        double result = (double) 7/(double) 3;
        System.out.println(result);

        int ceilResult = (int) Math.ceil(result);
        System.out.println(ceilResult);     // Using ceil method

        int floorResult = (int) Math.floor(result);
        System.out.println(floorResult);    // Using floor method

        // Increment Operations
        int x = 1;
        int y = x++;

        System.out.println("Value of x: " + x + "\nValue of y after postfix increment of x: " + y);

        int p = 10;
        int q = ++p;

        System.out.println("Value of p: " + p + "\nValue of q after prefix increment of p: " + q );

        // Implicit Casting
        short a = 1;
        int b = a + 2;

        System.out.println(b);

        // To convert string to byte >> short >> integer >> long >> float >> double
        String number = "12345";
        int rNumber = Integer.parseInt(number);

        System.out.println(rNumber + 5);

        // Random Number Generator
        int random = (int)(Math.random() * 100);
        System.out.println(random);

        // To compare two values
        byte v1 = 50;
        byte v2 = 60;

        int re1 = Math.max(v1, v2);  //Returns the Maximum value
        int re2 = Math.min(v1, v2); // Returns the Minimum value

        System.out.println(re1);
        System.out.println(re2);


    }
}
