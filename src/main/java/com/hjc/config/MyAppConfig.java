package com.hjc.config;

import com.hjc.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyAppConfig
 * @Description TODO
 * @Date 2020-01-14 11:00
 * @Created by Justin
 */
@Configuration
public class MyAppConfig {

    @Bean()
    public HelloService helloService() {
        return new HelloService();
    }

}
