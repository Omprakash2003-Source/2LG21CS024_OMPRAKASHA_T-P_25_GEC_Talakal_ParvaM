package com.example.JobBridge.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JobBridge.Model.Userlogin;

@Repository
public interface UserloginRepository extends JpaRepository<Userlogin, Long> {

    // Custom finder methods
    Userlogin findByEmail(String email);
    Userlogin findByPassword(String password);
}
