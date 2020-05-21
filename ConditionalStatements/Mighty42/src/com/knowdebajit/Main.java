/*
The Mighty 42

@The Problem is originally known as the Life, Universe & Everything Problem
 */

package com.knowdebajit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        short num;

        while(true){
            num = input.nextShort();

            if(num != 42)
                System.out.println(num);
            else
                break;
        }

    }
}
