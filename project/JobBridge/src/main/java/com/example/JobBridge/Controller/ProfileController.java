package com.example.JobBridge.Controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String showProfile() {
        return "Profile"; // Do not add .html
    }
}


