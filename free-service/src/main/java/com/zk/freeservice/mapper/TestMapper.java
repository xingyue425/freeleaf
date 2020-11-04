package com.zk.freeservice.mapper;

import com.zk.freeservice.model.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

  public Test getSinleTestName();
}
