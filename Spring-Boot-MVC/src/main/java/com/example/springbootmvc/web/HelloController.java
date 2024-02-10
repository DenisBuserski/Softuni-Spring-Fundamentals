package com.example.springbootmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/test1")
    public String test1(Model model) {
        model.addAttribute("num", 3);
        return "testpage";
    }

    @GetMapping("/test2")
    public String test2(ModelMap modelMap) {
        modelMap.put("num", 4);
        return "testpage";
    }

    @GetMapping("/test3")
    public ModelAndView test3(ModelAndView modelAndView) {
        modelAndView.addObject("num", 5);
        modelAndView.setViewName("testpage");
        return modelAndView;
    }

    @GetMapping("/test4")
    public String test4(Model model,
                        @RequestParam("num") Integer num) {
        model.addAttribute("num", num);
        return "testpage";
        // TEST -> http://localhost:8080/test4?num=27
    }

    @GetMapping("/test5/{id}/tryme")
    public String test5(Model model,
                        @PathVariable("id") Integer id) {
        model.addAttribute("num", id);
        return "testpage";
        // TEST -> http://localhost:8080/test5/87/tryme
    }

}
