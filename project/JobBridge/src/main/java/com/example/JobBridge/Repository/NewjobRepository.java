package com.example.JobBridge.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JobBridge.Model.Newjob;

@Repository
public interface NewjobRepository extends JpaRepository<Newjob, Long> {
}
