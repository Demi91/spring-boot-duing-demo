package com.duing.demo03.controller;

import com.duing.demo03.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ThymeController {

    @RequestMapping("/thyme")
    public String index(Model model){
        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("黄晓明");
        restaurant.setChef("林大厨");
//        model.addAttribute("name","<h1>Thymeleaf</h1>");
        model.addAttribute("restaurant",restaurant);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "/thymeleaf/welcome";
    }
}
