package com.knowdebajit;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // For loop
        int [] arr = new int[100];

        for (int i=0;i<arr.length; i++)
            arr[i] = i;

        byte i = 0;
        while(i != 100){
            System.out.println(arr[i]);
            i++;
        }



    }
}
