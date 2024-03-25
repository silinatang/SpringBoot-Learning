package com.didispace.chapter22;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 对Swagger的演示--创建组织Restful api文档
 */
@EnableSwagger2Doc //通常用于启用Swagger文档生成功能。
@SpringBootApplication
public class Chapter22Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter22Application.class, args);
    }

}
