package com.example.JobBridge.Controller;
            
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;     
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.JobBridge.Model.Newjob;
import com.example.JobBridge.Service.NewjobService;

@Controller
public class NewjobController {

    @Autowired
    private NewjobService newjobService;

    @GetMapping("/new-job")
    public String showNewjobForm(Model model) {
      model.addAttribute("job", new Newjob());
            
        return "new_job";                                
    }


    @PostMapping("/new-job")
    public String submitNewjobForm(@ModelAttribute("job") Newjob job) {
        newjobService.saveJob(job);
        return "redirect:/job_listing";                     
    }

    @GetMapping("/job-listing")
    public String showJobListings(Model model){
        model.addAttribute("job_Listing", newjobService.getAllNewjobs());
        return "job_listing";                               
    }

}
