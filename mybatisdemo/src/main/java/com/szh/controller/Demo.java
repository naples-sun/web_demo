package com.szh.controller;

import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "v1", description = "my first demo")
@RequestMapping("v1")
public class Demo {
    @Autowired
    private SqlSessionTemplate template;
    @RequestMapping(value = "getUserCount", method = RequestMethod.GET)
    public int getUserCount(){
        return template.selectOne("getUserCount");
    }
}
