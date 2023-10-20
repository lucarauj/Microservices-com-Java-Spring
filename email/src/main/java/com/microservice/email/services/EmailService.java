package com.microservice.email.services;

import com.microservice.email.enums.StatusEmail;
import com.microservice.email.models.EmailModel;
import com.microservice.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class EmailService {

    private final EmailRepository emailRepository;
    private final JavaMailSender mailSender;

    public EmailService(EmailRepository emailRepository, JavaMailSender mailSender) {
        this.emailRepository = emailRepository;
        this.mailSender = mailSender;
    }

    @Value("${spring.mail.username}")
    private String emailFrom;

    @Transactional
    public EmailModel sendEmail(EmailModel emailModel) {
        try{
            emailModel.setSendDateEmail(LocalDateTime.now());
            emailModel.setEmailFrom(emailFrom);

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(emailModel.getEmailTo());
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());
            mailSender.send(message);
            emailModel.setStatusEmail(StatusEmail.SENT);
        } catch (MailException e) {
            emailModel.setStatusEmail(StatusEmail.ERROR);
        } finally {
            return emailRepository.save(emailModel);
        }
    }
}
