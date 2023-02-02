package com.ms.sendemailservice.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.sendemailservice.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
    
}
