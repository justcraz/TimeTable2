package com.example.timetable.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    String sayHello(){
        return "<h2 style=\"color: blue\">Hello</h2>";
    }
}
