package com.example.springbootmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "helloworld";
    }

    @GetMapping("/hellonew")
    public ModelAndView helloNew(ModelAndView modelAndView) {
        modelAndView.setViewName("helloworld");
        return modelAndView;
    }
}
