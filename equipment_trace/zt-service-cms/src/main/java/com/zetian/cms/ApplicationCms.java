package com.zetian.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zetian.cms.dao")
public class ApplicationCms {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationCms.class, args);
    }
}