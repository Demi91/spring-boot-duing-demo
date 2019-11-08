package com.duing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Configuration
 * 首先声明是配置文件类
 * @EnableSwagger2
 * 开启swagger功能
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 使用swagger需要创建一个摘要  Docket
     * 摘要参数如下：
     * 文档类型 - 使用swagger2 -  DocumentationType.SWAGGER_2
     * 文档通过一系列的选择器组成   api  path
     * select()设置apis()和paths()
     * apis 查找生成哪些controller的接口
     *        获取所有RequestHandlerSelectors.any()
     * path 在查找出来的接口中进行筛选
     * @return
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.duing.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * 自定义文档的介绍
     * 通过ApiInfoBuilder创建ApiInfo
     * 参数可以设置  title description version 标题  描述  版本等等
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("spring-boot-duing-06-swagger")
                .description("这是一个简单的swagger demo。")
                .version("1.0")
                .build();
    }
}
