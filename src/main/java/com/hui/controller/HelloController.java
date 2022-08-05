package com.hui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        return "Hello";
    }
}
