package com.hjc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2020-01-13 19:32
 * @Created by Justin
 */

@RestController
public class HelloController {

    @Value("${person.lastName}") //注入配置文件的某个变量
    private String name;

    @RequestMapping("/hello")
    public String  hello() {
        return "hello " + name;
    }
}
