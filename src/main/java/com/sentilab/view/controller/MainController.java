package com.sentilab.view.controller;


import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
@RequestMapping("/")
public class MainController {

    public String main() {
        return "index";
    }

    @GetMapping(value = "/index")
    public String index(Model model)
    {
        model.addAttribute("title", "mozzi");
        return "index";
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "hello";
    }


}