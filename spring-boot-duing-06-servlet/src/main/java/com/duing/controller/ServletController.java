package com.duing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServletController {

    @RequestMapping("/servlet")
    public String servlet(){
        System.out.println("ServletController servlet........");
        return "Hello Servlet";
    }
}
