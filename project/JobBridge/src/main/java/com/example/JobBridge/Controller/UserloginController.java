package com.example.JobBridge.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.JobBridge.Model.Userlogin;
import com.example.JobBridge.Service.UserloginService;

@Controller
public class UserloginController {

    @Autowired
    private UserloginService userloginService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "userlogin";  // Ensure userlogin.html is in src/main/resources/templates
    }

    
    // Prepare form with empty Register object
    
  
@GetMapping("/userlogin/create")
public String showCreateForm(Model model) {
    model.addAttribute("userlogin", new Userlogin());
    return "create-userlogin"; // Make sure this HTML template exists
}



    @PostMapping("/userlogin/save")
public String saveUserlogin(@ModelAttribute Userlogin user) {
    userloginService.saveUserlogin(user);
    return "redirect:/login/list";
}

    @GetMapping("/login/list")
    public String getindexPage(Model model) {
        model.addAttribute("index",userloginService.listAll() );
        return "index.html";  // This assumes index.html is in src/main/resources/static
}


    
}
