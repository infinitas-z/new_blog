package com.jason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jason.mapper")
public class JasonBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(JasonBlogApplication.class,args);
    }
}
