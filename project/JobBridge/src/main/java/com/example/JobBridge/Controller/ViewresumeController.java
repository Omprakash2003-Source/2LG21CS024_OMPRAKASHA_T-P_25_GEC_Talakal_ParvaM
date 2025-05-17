package com.example.JobBridge.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewresumeController {

    @GetMapping("/viewresume")
    public String viewResumesPage() {
        return "Viewresume"; // Thymeleaf will load templates/viewresume.html
    }
}
