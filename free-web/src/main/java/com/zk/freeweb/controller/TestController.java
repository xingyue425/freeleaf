package com.zk.freeweb.controller;

import com.zk.freeservice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  private TestService testService;

  @RequestMapping("/name")
  public String getTestName(){
    return testService.getSinleTestName();
  }
}
