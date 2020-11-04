package com.zk.freeweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zk")
public class FreeWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(FreeWebApplication.class, args);
  }


}
