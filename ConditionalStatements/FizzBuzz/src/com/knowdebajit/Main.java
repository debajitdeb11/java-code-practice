/*
This is a famous interview Question : Fizz Buzz
 */
package com.knowdebajit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        short num = scanner.nextShort();

        String fizz = "Fizz";
        String buzz = "Buzz";

        if(num % 5 == 0 && num % 3 == 0)
            System.out.println(fizz+buzz);
        else if (num % 5 == 0)
            System.out.println(fizz);
        else if (num % 3 == 0)
            System.out.println(buzz);
        else
            System.out.println(num);

    }
}
