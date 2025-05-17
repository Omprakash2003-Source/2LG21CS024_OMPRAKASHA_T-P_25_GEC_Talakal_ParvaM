package com.example.JobBridge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SingleblogController {

    @GetMapping("/blog/single")
    public String getSingleBlog() {
        return "single-blog"; // This should match the name of your HTML file (without `.html`)
    }
}
