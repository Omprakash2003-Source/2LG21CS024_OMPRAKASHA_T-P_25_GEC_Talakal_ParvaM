package com.example.JobBridge.Controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserprofileController {

    @GetMapping("/userprofile")
    public String showProfile(Model model) {
        // Dummy data for demonstration (in practice, fetch this from a service/database)
        model.addAttribute("name", "Anil Maurya");
        model.addAttribute("username", "@Test1");
        model.addAttribute("location", "India");
        model.addAttribute("email", "anilmaurya9876@gmail.com");
        model.addAttribute("mobile", "1234567893");
        model.addAttribute("address", "C.P. Telica, Rd No.27, Behind Sion Garage, Near Shiv Temple, Wagle Estate, Thane - West");
        model.addAttribute("resumeStatus", "Not Uploaded");

        return "userprofile"; // This resolves to profile.html in resources/templates
    }
}
