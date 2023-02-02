package com.ms.sendemailservice.services;


import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ms.sendemailservice.models.EmailModel;

public interface EmailService {
    EmailModel sendEmail(EmailModel emailModel);
    Page<EmailModel> findAll(Pageable pageable);
    Optional<EmailModel> findById(UUID emailId);
}
