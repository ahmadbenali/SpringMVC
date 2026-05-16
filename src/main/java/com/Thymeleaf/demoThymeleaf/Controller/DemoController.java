package com.Thymeleaf.demoThymeleaf.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class DemoController {

    @GetMapping
    public String HelloWorld(Model model) {
        model.addAttribute("TheDate", java.time.LocalDateTime.now());
        return "HelloWorld";// must be same name as html file . this will not return a string helloworld
        //it will create a HelloWorld.html
    }
}
