package com.knowdebajit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // To take the input from the system's console
        Scanner scanner = new Scanner(System.in);

        // Name:
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine().trim();

        // Age:
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();


        System.out.println("Hello, " + name + "\nYour Age is: " + age);

        if(age > 16)
            System.out.println("Let's Have a Drink");

        System.out.println("Bye!!!!!!");
    }
}
