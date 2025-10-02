package com.solanoize.labs.service;

import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailService implements MessageService {

  @Override
  public String sendMessage(String message) {
    return "Email: " + message;
  }
  
}
