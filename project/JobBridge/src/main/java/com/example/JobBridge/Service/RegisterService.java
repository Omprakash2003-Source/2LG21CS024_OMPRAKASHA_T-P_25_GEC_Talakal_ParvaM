package com.example.JobBridge.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JobBridge.Model.Register;
import com.example.JobBridge.Repository.RegisterRepository;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    public List<Register> listAll() {
        return registerRepository.findAll();
    }

    public void saveRegister(Register register) {
        registerRepository.save(register);
    }
}
