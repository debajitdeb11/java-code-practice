package com.knowdebajit;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Creating a Multi Dimensional Array
        /* Method: 1 */
        int[][] mdArray = new int[2][3];
        mdArray[0][0] = 1;
        mdArray[1][0] = 2;

        System.out.println(Arrays.deepToString(mdArray));

        /* Method: 2 */
        int[][] mdArray2 = { {1,2, 0}, {0,0,0} };
        System.out.println(Arrays.deepToString(mdArray2));
    }
}
