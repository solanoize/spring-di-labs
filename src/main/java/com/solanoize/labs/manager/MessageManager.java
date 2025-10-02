package com.solanoize.labs.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    private MessageService emailService;
    private MessageService whatsappService;
    private MessageService smsService;

    @Autowired
    public void setEmailService(EmailService service) { this.emailService = service; }

    @Autowired
    public void setWhatsappService(WhatsappService service) { this.whatsappService = service; }

    @Autowired
    public void setSMSService(SMSService service) { this.smsService = service; }

    public String processEmail(String message) { return emailService.sendMessage(message); }
    public String processWhatsapp(String message) { return whatsappService.sendMessage(message); }
    public String processSMS(String message) { return smsService.sendMessage(message); }
}

