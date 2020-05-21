package com.knowdebajit;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
	    // Initilization of an Array
        /* Method: 1 */
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        /* Method: 2 */
        float [] decimals = { 10.2F, 15.9F, 16.963F, 17.25F, 2.0F };

        System.out.println(Arrays.toString(decimals));

        // Sort of an array
        Arrays.sort(decimals);
        System.out.println(Arrays.toString(decimals));
    }
}
