package com.email.sender.emailSender.controller;

import com.email.sender.emailSender.service.MailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.IOException;

@RestController
public class Mailer {

    @Autowired
    private MailerService mailerService;

    /**
     * Get method to send email
     * @param name
     * @param email
     * @param phone
     * @param country
     * @param msg
     * @return
     * @throws MessagingException
     * @throws IOException
     */
    @RequestMapping(value = "/sendmail")
    public ResponseEntity<String> sendmail(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("phone") String phone, @RequestParam("country") String country, @RequestParam("msg") String msg) throws MessagingException, IOException {
        mailerService.sendEmail(name, email, phone, country, msg);
        return new ResponseEntity<String> ("Email sent Successfully", HttpStatus.OK);
    }

}
