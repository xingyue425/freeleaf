package com.zk.freeservice.service;

import com.zk.freeservice.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

  @Autowired
  private TestMapper testMapper;

  public String getSinleTestName(){

    return testMapper.getSinleTestName().getName();
  }
}
