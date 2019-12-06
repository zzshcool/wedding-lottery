package com.wedding.lottery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {


    @GetMapping("/")
    public String welcome(Model model) {
        return "welcome"; //view
    }

    @GetMapping("/result")
    public String result(Model model) {
        model.addAttribute("winner", 5566);

        return "result"; //view
    }
}
