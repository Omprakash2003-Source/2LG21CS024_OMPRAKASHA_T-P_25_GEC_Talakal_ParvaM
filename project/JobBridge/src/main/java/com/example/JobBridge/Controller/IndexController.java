package com.example.JobBridge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {

    // This method maps the root URL to index.html
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
}



    
