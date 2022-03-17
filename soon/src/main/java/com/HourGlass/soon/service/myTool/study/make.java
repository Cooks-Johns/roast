package com.HourGlass.soon.service.myTool.study;

public class make {

    private static String[] planets = {"Mercury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};




    public static void main(String[] args) {
        
        
        System.out.println("What is in my list:");


// -->Iteration Loop
//        for (int i = 0; i < planets.length; i++) {
//            System.out.println((mon[i]));
//        }



// -- FOR EACH
        // This does the same as the code above
        // but instead of iterating through the index
        // only evaluates a single line at a time

//        for (String planets :
//                planets) {
//            System.out.println(planets);
//        }


// -- WHILE LOOP

//        int count = 0;
//        // will keep going as long as the count doesn't excede
//        // number of items within the array
//        while (count < planets.length) {
//            System.out.println(planets[count]);
//            count ++;
//        }


// -- DO WHILE LOOPS

        int hopper = 0;
        do {
            System.out.println(planets[hopper]);
            hopper ++;

            if (hopper == 3) {
                break;
            }
        } while (hopper < planets.length);

    }
}
