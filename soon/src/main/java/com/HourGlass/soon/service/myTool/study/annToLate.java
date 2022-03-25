package com.HourGlass.soon.service.myTool.study;

import java.applet.Applet;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// When using these annotation keep in mind the java version
@Target(ElementType.TYPE_USE)
@interface showMeAdemo{}

public class annToLate {


    public static void main(String[] args) {
        @showMeAdemo String st = "I think I am learning this annotation thing";
        System.out.println(st);
        annReturnFunctionType();
    }


    static int annReturnFunctionType() {
        System.out.println("Right, know you have met ann");
        return 0;
    }

    static class makeAheart extends Applet {

    }

// end
}


