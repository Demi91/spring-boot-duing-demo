package com.duing.controller;

import com.duing.bean.Food;
import com.duing.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @RestController
 * 是@Controller和@ResponseBody的组合
 * 返回json形式的响应结果   而不是视图(jsp html)
 */
@RestController
public class JsonController {

    /**
     * food.rice=rice
     * food.meat=meat
     * @Value 通过${}结构获得配置文件中属性值
     * */
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
}
