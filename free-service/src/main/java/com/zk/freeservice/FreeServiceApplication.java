package com.zk.freeservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zk.freeservice.mapper")
public class FreeServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(FreeServiceApplication.class, args);
  }


}
