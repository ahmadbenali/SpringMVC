package com.Thymeleaf.demoThymeleaf.Controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {


    @GetMapping("/showform")
    public String showForm() {
        return "Welcome_form";
    }

    @RequestMapping("/processForm")
    public String processForm(Model model) {
        model.addAttribute("TheDate",java.time.LocalDateTime.now());
        return "HelloWorld";
    }

    @PostMapping("/processFormV2")
    public String processFormV2(@RequestParam("studentName") String name, Model model) {
        //read the request parameter from the html form

        name = name.toUpperCase();

        String Themessage="good? "+name;

        model.addAttribute("message",Themessage);

        return "HelloWorld";
    }
}
