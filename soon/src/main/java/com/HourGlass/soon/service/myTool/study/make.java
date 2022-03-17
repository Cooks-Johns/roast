package com.HourGlass.soon.service.myTool.study;

import java.util.Scanner;

public class make {

    private static String[] planets = {"Mercury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};


    public static void main(String[] args) {

        System.out.println("What is in my list:");

// -->Iteration Loop
//        iteration();

// -- FOR EACH
//        forDaEach();

// -- WHILE LOOP
//        whileTheLoop();


// -- DO WHILE LOOPS
//        doWhile();

// -- PASSING IN a user input as a pram for method below
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.printf("Enter a planet: \n");
            String givenPlanet = scan.nextLine();
            if (givenPlanet.length() == 0) {
                break;
            }
            int planetNum = findPlanetNum(givenPlanet);
        }




    }
//END


// ---      WareHouse of Methods     ---------

    private static int findPlanetNum(String planetName) {
        for (int i = 0; i < planets.length; i++) {
            if (planetName.equalsIgnoreCase(planets[i])) {
                return i;
            }
        }
        return -1;
    }

// -- FOR EACH
    private static void forDaEach() {
        // This does the same as the code above
        // but instead of iterating through the index
        // only evaluates a single line at a time

        for (String planets :
                planets) {
            System.out.println(planets);
        }
    }


// -- WHILE LOOP
    private static void whileTheLoop() {
        int count = 0;
        // will keep going as long as the count doesn't excede
        // number of items within the array
        while (count < planets.length) {
            System.out.println(planets[count]);
            count ++;
        }
    }


    private static void doWhile() {
        int hopper = 0;
        do {
            System.out.println(planets[hopper]);
            hopper ++;

            if (hopper == 3) {
                break;
            }
        } while (hopper < planets.length);
    }


// -->Iteration Loop
    private static void iteration() {
        for (int i = 0; i < planets.length; i++) {
            System.out.println((planets[i]));
        }
    }



}
