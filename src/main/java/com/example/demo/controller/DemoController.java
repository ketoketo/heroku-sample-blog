package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@RequestMapping("/")
@Controller
public class DemoController {

    @GetMapping
    public String demoGet(@RequestParam(value = "param", required = false) Optional<String> param, Model model) {
        model.addAttribute("demo", param.orElse("入力なし"));
        return "home";
    }
}
