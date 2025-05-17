package com.example.JobBridge.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String getAboutPage() {
        return "about"; // Thymeleaf will resolve to about.html
    }
}
