
package com.example.JobBridge.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JobBridge.Model.Contact;
import com.example.JobBridge.Repository.ContactRepository;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void saveMessage(Contact message) {
        contactRepository.save(message);
    }
}
