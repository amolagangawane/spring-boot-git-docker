package com.practice_jpa.controller;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "welcome to spring world";
    }
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello there!";
    }


    @PostMapping("/test")
    public Map<String,String> testPost(@RequestBody Map<String,String> hm){

        return hm;
    }
}
