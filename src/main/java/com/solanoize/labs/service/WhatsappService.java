package com.solanoize.labs.service;

import org.springframework.stereotype.Service;

@Service("whatsappService")
public class WhatsappService implements MessageService {

  @Override
  public String sendMessage(String message) {
    return "Whatsapp: " + message;
  }
}
