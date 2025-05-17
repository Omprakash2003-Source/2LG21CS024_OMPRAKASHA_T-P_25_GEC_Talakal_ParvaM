package com.example.JobBridge.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JobBridge.Model.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {

    // Custom finder methods
    Register findByUsername(String username);
    Register findByEmail(String email);
}
