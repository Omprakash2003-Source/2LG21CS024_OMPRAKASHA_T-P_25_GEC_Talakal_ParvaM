package com.example.JobBridge.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JobBridge.Model.Adminlogin;
import com.example.JobBridge.Repository.AdminloginRepository;

@Service
public class AdminloginService {

    @Autowired
    private AdminloginRepository adminloginRepository;

    public List<Adminlogin> listAll() {
        return adminloginRepository.findAll();
    }

    public void saveAdminlogin(Adminlogin adminlogin) {
        adminloginRepository.save(adminlogin);
    }

    public boolean authenticate(String email, String password) {
        Adminlogin admin = adminloginRepository.findByEmail(email);
        return admin != null && admin.getPassword().equals(password);
    }
}
