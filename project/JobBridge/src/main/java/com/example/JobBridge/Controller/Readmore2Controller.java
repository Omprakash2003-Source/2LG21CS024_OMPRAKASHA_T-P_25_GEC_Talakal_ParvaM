package com.example.JobBridge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Readmore2Controller {

    @GetMapping("/single")
    public String singleBlogPage() {
        // This returns the Thymeleaf template located at templates/single-blog.html
        return "Readmore2";
    }
}

