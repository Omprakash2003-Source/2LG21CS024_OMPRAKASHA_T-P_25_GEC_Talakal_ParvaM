
package com.example.JobBridge.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JobBridge.Model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
