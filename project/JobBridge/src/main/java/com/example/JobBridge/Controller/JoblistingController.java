package com.example.JobBridge.Controller;


    import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class JoblistingController {

    

    @GetMapping("/job_listing")
    public String showJobListing(Model model) {
       
        return "job_listing"; // NO leading slash, NO `.html`
    }
}


