package com.solanoize.labs.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.solanoize.labs.service.MessageService;

@Component
public class MessageManager {
  private MessageService messageService;

  @Autowired
  @Qualifier("whatsappService")
  public void setMessageService(MessageService messageService) {
    this.messageService = messageService;
  }

  public String processMessage(String message) {
    return messageService.sendMessage(message);
  }
}
