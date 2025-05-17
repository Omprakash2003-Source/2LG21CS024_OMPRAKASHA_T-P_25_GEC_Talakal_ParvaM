package com.example.JobBridge.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactControlller {

    @GetMapping("/contact")
    public String showContactForm() {
        return "contact"; // returns contact.html view
    }

    @PostMapping("/contact")
    public String handleContactForm(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("subject") String subject,
            @RequestParam("message") String message,
            Model model
    ) {
        // You could save the form data to a database, send an email, etc.
        System.out.println("Contact form submitted:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);

        model.addAttribute("successMessage", "Thank you for contacting us!");
        return "contact"; // redirect or forward back to the contact page with success message
    }
}

