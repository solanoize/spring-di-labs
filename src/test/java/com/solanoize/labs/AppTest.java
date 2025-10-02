package com.solanoize.labs;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.solanoize.labs.configuration.AppConfiguration;
import com.solanoize.labs.manager.MessageManager;


public class AppTest {
  
  private ConfigurableApplicationContext context;
  private MessageManager messageManager;


  @BeforeMethod
  public void setUp() {
    context = new AnnotationConfigApplicationContext(AppConfiguration.class);
    messageManager = context.getBean(MessageManager.class);
  }

  @Test(priority = 1)
  public void contextMustBeNotNull() {
    Assert.assertNotNull(context);
  }

  @Test(priority = 2)
  public void messageMustBeValidByService() {
    Assert.assertEquals(messageManager.processSMS("Hello Bro"), "SMS: Hello Bro");
  }

  @Test(priority = 3)
  public void beanMustBeSingleton() {
    Assert.assertSame(messageManager, context.getBean(MessageManager.class));
  }

  @AfterMethod
  public void tearDown() {
    context.close();
    messageManager = null;
  }
}
