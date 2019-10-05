package com.james;

import com.james.mapperscan.CustomerService;
import com.james.mapperscan.MyConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class ApplicationStart {
  public static void main(String[] args) {
    //
      AnnotationConfigApplicationContext context  =new AnnotationConfigApplicationContext();
      context.register(MyConfig.class);
      context.refresh();

      CustomerService customerService = context.getBean("customerService", CustomerService.class);
    System.out.println(customerService.query());
  }
}
