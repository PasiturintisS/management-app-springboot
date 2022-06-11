package com.springboot.springboot.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // Another Stuff ///////////////////////////////////////////////////////////////////////////////////////////////////
    // 1. budas gauti get request naudojant @RequestMapping anotacija
    // for more info on RequestMapping
    // https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html
    /*
    // value = "/" yra end point.
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(){
        return "Welcome to Laurynas Sunday, using @RequestMapping annotation";
    }
     */
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // 2. budas gauti get request naudojant @Get mapping anotacija
    // for more info on RequestMapping
    // https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/GetMapping.html
    // "/" yra end point.
    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to Laurynas Sunday, using @GetMapping annotation, using Dev-Tools dependency for auto update in browser.";
    }
}
