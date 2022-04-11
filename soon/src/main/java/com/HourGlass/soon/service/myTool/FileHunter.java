package com.HourGlass.soon.service.myTool;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHunter {



    public static void main(String[] args) {


        fileBuilder();


    } // End Main





    private static void fileBuilder() {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("casper.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
