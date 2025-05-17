package com.example.JobBridge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contact2Controller {

    

    @GetMapping("/contact2")
    public String showContact2(Model model) {
        return "contact2"; // Refers to contact2.html Thymeleaf template
    }
}
