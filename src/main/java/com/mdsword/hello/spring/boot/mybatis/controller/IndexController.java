package com.mdsword.hello.spring.boot.mybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "Hello Spring Boot Mybatis";
    }
}
