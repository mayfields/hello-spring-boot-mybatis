package com.mdsword.hello.spring.boot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.mdsword.hello.spring.boot.mybatis.dao")
public class HelloSpringBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootMybatisApplication.class, args);
	}

}
