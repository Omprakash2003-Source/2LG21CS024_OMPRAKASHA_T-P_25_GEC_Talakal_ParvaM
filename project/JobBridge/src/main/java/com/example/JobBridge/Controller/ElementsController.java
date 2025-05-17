package com.example.JobBridge.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElementsController {

    @GetMapping("/elements")
    public String showElements() {
        return "elements"; // Corresponds to elements.html in src/main/resources/templates if using Thymeleaf
    }
}
