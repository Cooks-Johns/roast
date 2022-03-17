package com.HourGlass.soon.service.myTool;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCal {


    public static void main(String[] args) {


        System.out.println("-- Simple Cal -- ");
        Scanner scan = new Scanner(System.in);

        // First input
        System.out.println("Enter first int: \n");
        String alaphInt = scan.nextLine();
        double dubAlpha = Double.parseDouble(alaphInt);

        // second input
        System.out.println("Enter second int: \n");
        String betaInt = scan.nextLine();
        double dubBeta = Double.parseDouble(betaInt);

        menu();

        String work = scan.nextLine();
        String main = work;

                       // cal fixme set this up so that the main isn't reaading false
            if (main == "1") {
                double results = dubAlpha + dubBeta;
                System.out.println(results);

            } else if ( main == "subtract" || main == "2"){
                double results = dubAlpha - dubBeta;

            } else if ( main == "multiply" || main == "3"){
                double results = dubAlpha - dubBeta;

            } else if ( main == "" || main == "4"){
                double results = dubAlpha - dubBeta;
            } else {
                System.out.println("Invalid entry! ");
            }

    }



    private static void menu() {
        System.out.println("__________________________ \n");
        System.out.println("What would you like to do? \n" +
                            "1) Add \n" +
                            "2) Subtract \n" +
                            "3) Multiply \n" +
                            "4) \n" +
                            "5) \n");
    }


}
