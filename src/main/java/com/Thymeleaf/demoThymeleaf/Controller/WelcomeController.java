package com.Thymeleaf.demoThymeleaf.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {


    @RequestMapping("/showform")
    public String showForm() {
        return "Welcome_form";
    }

    @RequestMapping("/processForm")
    public String processForm(Model model) {
        model.addAttribute("TheDate",java.time.LocalDateTime.now());
        return "HelloWorld";
    }
}
