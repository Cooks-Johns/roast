package com.HourGlass.soon.service.myTool.study;

import java.util.Scanner;

public class OverLoadMe {




    public static void main(String[] args) { // main method that is calling two different methods

        //  Each method is depened on the next
        mainInputsWithPrint();


    }



    //STEP 1)
    private static void mainInputsWithPrint() {
        String inputOne = getInput("Enter your first value: \n");
        String inputTwo = getInput("Enter your second value: \n");

        double mainPrint = addValues(inputOne, inputTwo);
        System.out.println("The first test: " + mainPrint);

        double secPrint = sumOfNums(inputOne,inputTwo, inputOne, inputTwo);
        System.out.printf("The results from multiple inputs is :" + secPrint);
    }



    //STEP 2)
    // takes the logic from the cmd line and makes it reusalble
    private static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }



    //STEP 3)
    // parse string then turns them into doubles and then add the values
    private static double addValues(String inputOne, String inputTwo) {
        double dubOne = Double.parseDouble(inputOne);
        double dubTwo = Double.parseDouble(inputTwo);
        return dubOne + dubTwo;
    }




    //STEP 4)
    // ... = accept any number of items as long as they are the same type
    private static double sumOfNums(String... values) {
        double sumOfLoop = 0;
        for (String str:
            values) {
            double d = Double.parseDouble(str);
            sumOfLoop += d;
        }
        return sumOfLoop;
    }



}
