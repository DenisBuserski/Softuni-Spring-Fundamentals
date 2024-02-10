package com.example.springbootmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/denis")
public class DenisController {

    @GetMapping("/love")
    public String denis() {
        return "denispage";
    }
}
