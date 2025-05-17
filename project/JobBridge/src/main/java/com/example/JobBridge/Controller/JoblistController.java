package com.example.JobBridge.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoblistController {

    
    @GetMapping("/joblist")
    public String getJobList(Model model) {
    return "joblist"; 
    }
}


