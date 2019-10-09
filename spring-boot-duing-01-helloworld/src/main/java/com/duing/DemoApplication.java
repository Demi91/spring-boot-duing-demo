package com.duing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * 声明我们的入口类  并且声明是springboot项目的
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //使用SpringApplication类的静态方法  启动springboot程序
        //方法的参数  程序的入口类  main函数的参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
