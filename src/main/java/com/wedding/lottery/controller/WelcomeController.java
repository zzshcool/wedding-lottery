package com.wedding.lottery.controller;


import com.wedding.lottery.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @Autowired
    LotteryService lotteryService;

    @GetMapping("/")
    public String welcome(Model model) {
        return "welcome"; //view
    }

    @GetMapping("/result")
    public String result(Model model, @RequestParam String name) {
        model.addAttribute("winners", lotteryService.getWinner(name));
        return "result"; //view
    }
}
