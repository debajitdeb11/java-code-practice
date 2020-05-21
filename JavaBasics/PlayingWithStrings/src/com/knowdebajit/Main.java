package com.knowdebajit;

public class Main {

    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println(message);

        // Playing with Concatenation of Strings
        String string1 = "Debajit";
        String string2 = "Deb";

        System.out.println(string1 + " " + string2);

        // Methods of String Class
        String total = string1 + string2;

        // Total No of String
        System.out.println("Total Length of the String is: " + total.length());

        // Ends with ?
        System.out.println(total.endsWith("Deb"));

        // To replace a string or a character
        System.out.println(total.replace("D", "B"));

        // To make the string Upper case
        System.out.println(total.toUpperCase());

        // Include special characters into our String
            // Double Quote
            System.out.println("\"Hello Debajit\"");

            // Defining Path using Backslash
            System.out.println("\\user\\home\\debajit\\Desktop\\....");

    }
}
