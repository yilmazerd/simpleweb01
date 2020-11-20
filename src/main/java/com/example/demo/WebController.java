package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    @GetMapping("/greeting")
    public String webSampleGet(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";

    }

    @PostMapping("/greeting")
    public String webSamplePost(@ModelAttribute Greeting greeting, Model model){
        model.addAttribute("greeting", greeting);
        return "result";
    }

}
