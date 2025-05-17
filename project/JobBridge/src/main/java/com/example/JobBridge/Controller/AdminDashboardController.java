package com.example.JobBridge.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminDashboardController{

    @GetMapping("/admin/dashboard")
    public String showDashboard() {
        return "Admin Dashboard"; // must match the file name without extension
    }
}
