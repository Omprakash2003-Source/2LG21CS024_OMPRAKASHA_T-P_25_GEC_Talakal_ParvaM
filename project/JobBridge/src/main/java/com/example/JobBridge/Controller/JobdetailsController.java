package com.example.JobBridge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobdetailsController {
    


    @GetMapping("/job-details")
    public String showJobDetailsPage() {
        return "job_details"; // This should match the filename in src/main/resources/templates (if using Thymeleaf)
    }
}
