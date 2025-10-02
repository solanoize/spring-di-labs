package com.solanoize.labs.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.solanoize.labs.service.MessageService;

@Component
public class MessageManager {
  @Autowired
  @Qualifier("emailService")
  private MessageService messageService;

  public String processMessage(String message) {
    return messageService.sendMessage(message);
  }
}
