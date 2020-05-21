package com.knowdebajit;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Concepts of Point
        Point point1 = new Point(1, 1);
        Point point2 = point1;

        // Let's update the point
        point1.x = 5;
        System.out.println(point2.x);

    }
}
