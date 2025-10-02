package com.solanoize.labs.service;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SMSService implements MessageService {

  @Override
  public String sendMessage(String message) {
    return "SMS: " + message;
  }

}
