package com.duing.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    /**
     * 在容器启动之后  通过ApplicationRunner的回调方法
     * 获取WebServerApplicationContext
     * context中可以调用webserver的类名
     * @param context
     * @return
     */
    @Bean
    public ApplicationRunner runner(WebServerApplicationContext context){
        return args -> {
            System.out.println("WebServerApplicationContext---当前webserver的实现类为："
             + context.getWebServer().getClass().getName());
        };
    }
}
