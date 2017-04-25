package com.mytestpro.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bidn.annotation.RequestMapping;

@controller
public class TestController{

    @RequestMapping("/test")
    public String test(){
        System.out.println("dasdas");

        return "test";
    }
}

