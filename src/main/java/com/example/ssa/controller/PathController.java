package com.example.ssa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {

    @RequestMapping("/")
    public String home() {
        return "redirect:/user";
    }
}
