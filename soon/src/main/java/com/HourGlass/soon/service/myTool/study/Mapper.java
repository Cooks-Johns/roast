package com.HourGlass.soon.service.myTool.study;

import java.util.HashMap;

public class Mapper {

    public static void main(String[] args) {


        HashMap<String, Integer> emplIds = getStringIntegerHashMap();
        printFactory(emplIds);


    }




    private static void printFactory(HashMap<String, Integer> emplIds) {
        // Prints out complete list
//        System.out.println(emplIds); ////  {John=234, Jonnell=898, Peter=222, Jessy=983, Sam=3422}

        //
//        System.out.println(emplIds.keySet()); // [John, Jonnell, Peter, Jessy, Sam]

//        System.out.println(emplIds.containsKey("sam")); // false

//        System.out.println(emplIds.containsValue(222));  // true

        emplIds.put("Mark", 3082);
        System.out.println(emplIds);


    }


    private static HashMap<String, Integer> getStringIntegerHashMap() {
        // Employees
        HashMap<String, Integer> emplIds = new HashMap<>();


        emplIds.put("John", 234);
        emplIds.put("Peter", 222);
        emplIds.put("Jessy", 983);
        emplIds.put("Jonnell", 898);
        emplIds.put("Sam", 3422);
        return emplIds;
    }






}
