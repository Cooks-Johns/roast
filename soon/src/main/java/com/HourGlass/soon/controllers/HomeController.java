package com.HourGlass.soon.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

// Main Testing Request
    // ToDo --> turn this into a page that prints out 500 errors on this page
    @GetMapping("/test")
    public String test(@RequestParam(value = "testing", defaultValue = "Works Keep now")
                       String name) {
        return String.format("Your test %s", name);
    }

    @GetMapping("/bootstrap-testing")
    public String strap() {
        return "bootstrap-testing";
    }

// ToDo Page--> home
    @GetMapping("/home")
    public String starter() {
        return "home";
    }


    // Todo js drills with spring
    @GetMapping("/testScripts")
    public String testScripts() {return "testScripts";}

// ToDo Page--> countdown

// ToDo Page--> contact
    // ToDo --> about us





}
