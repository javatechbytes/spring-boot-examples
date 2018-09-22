package com.student.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.rest.model.Greetings;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    @ResponseBody
    public Greetings greeting(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name) {
        return new Greetings(name, "Welcome");
    }

}