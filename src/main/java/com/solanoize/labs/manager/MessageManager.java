package com.solanoize.labs.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solanoize.labs.service.EmailService;
import com.solanoize.labs.service.MessageService;
import com.solanoize.labs.service.SMSService;
import com.solanoize.labs.service.WhatsappService;


/**
 * Eager service
 */
@Component
public class MessageManager {

    @Autowired
    private EmailService emailService;

    @Autowired
    private WhatsappService whatsappService;

    @Autowired
    private SMSService smsService;

    public String processEmail(String message) { return emailService.sendMessage(message); }
    public String processWhatsapp(String message) { return whatsappService.sendMessage(message); }
    public String processSMS(String message) { return smsService.sendMessage(message); }
}

