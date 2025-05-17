package com.example.JobBridge.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JobBridge.Model.Adminlogin;

public interface AdminloginRepository extends JpaRepository<Adminlogin, Long> {
    Adminlogin findByEmail(String email);
}
