package com.duing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * food.rice=拌饭
 * food.meat=烤肉
 *
 * @ConfigurationProperties
 * 声明这是一个配置文件对应的类
 * prefix前缀指向配置文件中的一级目录
 */
@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig {

    private String rice;
    private String meat;
    private String[] sauce;

}
