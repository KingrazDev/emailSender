package com.email.sender.emailSender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class EmailSenderApplication {

	@Autowired
	private JavaMailSender javaMailSender;

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}

}
