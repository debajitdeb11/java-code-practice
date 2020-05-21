/*   We are Creating a Mortgage Calculator    */
package com.knowdebajit;

import java.io.LineNumberReader;
import java.text.Format;
import java.text.NumberFormat;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.println("Welcome to Mortgage Payment Calculator");
        Scanner scanner = new Scanner(System.in);

        // Name
        System.out.print("Please Enter you name: ");
        String name = scanner.nextLine().trim();

        // Principal Amount
        System.out.print("Enter the Principal Amount: ");
        final int principal = scanner.nextInt();

        // Interest Rate
        System.out.print("Enter the Annual Interest Rate: ");
        double annualInterest = scanner.nextDouble();
        final double monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;

        // Tenure
        System.out.println("Enter the tenure (in Years): ");
        double tenure = scanner.nextDouble();
        final double numberOfPayments = tenure * MONTH_IN_YEAR;

        // Mortgage
        final double mortgage = principal * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments))/(Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
        String amount = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Hello, " + name + "\nYour Monthly Morgage is: " + amount);

    }
}
