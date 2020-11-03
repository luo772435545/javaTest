package com.lu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类规则
 * 1.启动类位置：主包下面和子包同级
 * 2.需要一个@SpringBootApplication
 * @author GAN
 */
@MapperScan("com.lu.dao")
@SpringBootApplication
public class AppRun {
    public static void main(String[] args) {
//        参数：启动类类对象 主函数形参名
        SpringApplication.run(AppRun.class,args);
    }
}