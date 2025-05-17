package com.example.JobBridge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String showBlogPage() {
        return "blog"; // Make sure blog.html is in src/main/resources/templates if you're using Thymeleaf
    }
}

