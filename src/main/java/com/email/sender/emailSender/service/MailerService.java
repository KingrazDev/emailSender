package com.email.sender.emailSender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;

@Service
public class MailerService {
    @Autowired
    private JavaMailSender javaMailSender;

    String emailSender = "email@email.com";

	/**
	 * Method to send Email
	 * @param name
	 * @param email
	 * @param phone
	 * @param country
	 * @param message
	 * @throws MessagingException
	 * @throws IOException
	 */
    public void sendEmail(String name, String email, String phone, String country, String message) throws MessagingException, IOException {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(emailSender);
		msg.setSubject("Message Sent by: " + name);
		msg.setText("Hello Hasan,\n\n" + message + "\n\nContact Info: \n" + "Name : " + name + ": Email : " + email + ": Phone : " + phone + ": Country : " + country);
		javaMailSender.send(msg);
	}
}
