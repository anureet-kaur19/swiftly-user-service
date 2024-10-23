package com.swiftly.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.capgemini.aura")
public class Application {
  public static void main(String[] args) {
    System.out.print("Hello and welcome to Swiftly User Service!");
    SpringApplication.run(Application.class, args);
  }

}
