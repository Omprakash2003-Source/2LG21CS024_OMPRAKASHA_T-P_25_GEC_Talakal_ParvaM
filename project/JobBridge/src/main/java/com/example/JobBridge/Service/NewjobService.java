package com.example.JobBridge.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JobBridge.Model.Newjob;
import com.example.JobBridge.Repository.NewjobRepository;



@Service
public class NewjobService {
    @Autowired
    private NewjobRepository newjobRepository;

    public void saveJob(Newjob newjob) {
        newjobRepository.save(newjob);
    }

    public List<Newjob> getAllNewjobs() {
        return newjobRepository.findAll();
    }

    public Newjob getJobById(Long id) {
        return newjobRepository.findById(id).orElse(null);
    }

    public void deleteJob(Long id) {
        newjobRepository.deleteById(id);
    }
}
