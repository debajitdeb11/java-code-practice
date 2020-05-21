package com.knowdebajit;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        // Formatting Numbers into Currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(12345.67);

        System.out.println(result);

        // Percent Instant
        String res = NumberFormat.getPercentInstance().format(2);

        System.out.println(res);

    }
}
