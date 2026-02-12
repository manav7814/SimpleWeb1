package com.Manav.SimpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
    @RequestMapping("/")
   // @ResponseBody
    public  String great(){
        return "welcome to the web application ";
    }

    @RequestMapping("/about")
    public  String about(){
        return "This is about page";
    }
}

