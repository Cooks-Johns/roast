package com.HourGlass.soon.service.myTool.study;

import java.util.Scanner;

public class if_else {


    public static void main(String[] args) {

// When using older code you may need to use

        int monthNum = 11;
        montran(monthNum);


    }


    private static void montran(int monthNum) {
        if (monthNum >= 0 && monthNum <= 11) {

            if (monthNum >= 0 && monthNum <= 2) {
                if (monthNum == 0) {
                    System.out.println("It's January!");
                } else if (monthNum == 1) {
                    System.out.println("It's February");
                } else {
                    System.out.println("It's March");
                }
            }

            if (monthNum >= 3 && monthNum <= 5) {
                if (monthNum == 3) {
                    System.out.println("It's April!");
                } else if (monthNum == 4) {
                    System.out.println("It's May");
                } else {
                    System.out.println("It's June");
                }
            }

            if (monthNum >= 6 && monthNum <= 9) {
                if (monthNum == 3) {
                    System.out.println("It's July!");
                } else if (monthNum == 4) {
                    System.out.println("It's August");
                } else {
                    System.out.println("It's September");
                }
            }

            if (monthNum >= 10 && monthNum <= 11) {
                if (monthNum == 10) {
                    System.out.println("It's November!");
                } else {
                    System.out.println("It's December");
                }
            }

        } else {
            System.out.println("Invalid");
        }
    }
}
