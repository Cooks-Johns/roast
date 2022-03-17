package com.HourGlass.soon.service.myTool;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FixInt {





    public static void main(String[] args) {

    double dubInt = 3_434_394.93;

        // Prints out the exact number without _
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println("getNumberInstance(): " + numberFormat.format(dubInt));

        // Prints out the number rounded to the nearest whole num
        NumberFormat numberInt = NumberFormat.getIntegerInstance();
        System.out.println("getIntegerInstance(): " + numberInt.format(dubInt));

        numberFormat.setGroupingUsed(false);
        System.out.println("setGroupingUsed(): " + numberFormat.format(dubInt));

        // By using this it will change the location of the currency
        Locale locale = new Locale("de", "DE");
        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        System.out.println("Locale(): " + localFormat.format(dubInt));

        //
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println("getCurrencyInstance(locale): " + currencyFormat.format(dubInt));


        DecimalFormat decimalFormat = new DecimalFormat("$#0.00#");// by adding # this will only display char if needed else just add 0
        System.out.println(decimalFormat.format(1));
        System.out.println(decimalFormat.format(5.981));



    }

}
