package com.example.JobBridge.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.JobBridge.Model.Userlogin;
import com.example.JobBridge.Repository.UserloginRepository;

@Service
public class UserloginService {

    @Autowired
    private UserloginRepository userloginRepository;

 public List<Userlogin> listAll() {
        return userloginRepository.findAll();
    }

    public void saveUserlogin(Userlogin userlogin) {
        userloginRepository.save(userlogin);
    }

    public boolean authenticate(String email, String password) {
        Userlogin user = userloginRepository.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
