package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Homepage {

    public String index() {
        return "index";
    }
    @RequestMapping(value = "index")
    public String index2() {
        return "index";
    }
}
