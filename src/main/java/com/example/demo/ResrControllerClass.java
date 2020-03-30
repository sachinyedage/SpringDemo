package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("DemoApp")
public class ResrControllerClass {


    @GetMapping("   test")
    public String test(){

        return "Hello1";
        //test



    }
    @GetMapping("   test1")
    public String test1(){

        return "Hello1";
        //test



    }




}
