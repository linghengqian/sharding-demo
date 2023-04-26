package org.example.spring_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: myl86
 * @create: 2023-04-26 11:27
 **/
@SpringBootApplication
@MapperScan("org.example.spring_demo.mapper")
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
    }
}
