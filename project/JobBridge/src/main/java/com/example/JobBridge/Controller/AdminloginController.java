package com.example.JobBridge.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.JobBridge.Model.Adminlogin;
import com.example.JobBridge.Service.AdminloginService;

@Controller
public class AdminloginController {

    @Autowired
    private AdminloginService adminloginService;

    // Show login form
    @GetMapping("/adminlogin")
    public String showAdminLoginForm() {
        return "adminlogin"; // adminlogin.html in templates
    }

    // Show create form
    @GetMapping("/adminlogin/create")
    public String showCreateForm(Model model) {
        model.addAttribute("adminlogin", new Adminlogin());
        return "create-adminlogin"; // create-adminlogin.html in templates
    }

    // Save admin login data
    @PostMapping("/adminlogin/save")
    public String saveAdminlogin(@ModelAttribute Adminlogin adminlogin) {
        adminloginService.saveAdminlogin(adminlogin);
        return "redirect:/adminlogin/list";
    }

    // List all admin logins
    @GetMapping("/adminlogin/list")
    public String getIndexPage(Model model) {
        model.addAttribute("index", adminloginService.listAll());
        return "index"; // index.html in templates
    }
}
