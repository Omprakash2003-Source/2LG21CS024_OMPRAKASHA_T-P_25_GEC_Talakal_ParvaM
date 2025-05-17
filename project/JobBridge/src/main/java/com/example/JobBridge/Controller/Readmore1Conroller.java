package com.example.JobBridge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Readmore1Conroller {

    @GetMapping("/single-blog")
    public String singleBlog() {
        // This returns the view named "single-blog.html"
        return "readmore1";
    }
}

