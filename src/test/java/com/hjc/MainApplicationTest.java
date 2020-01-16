package com.hjc;

import com.hjc.bean.Person;
import com.hjc.controller.HelloController;
import com.hjc.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Classname MainApplicationTest
 * @Description TODO
 * @Date 2020-01-13 22:36
 * @Created by Justin
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MainApplicationTest {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    Person person;

    @Autowired
    HelloService helloService;

    @Test
    public void testContext(){
        assertNotNull(helloService);
        System.out.println(person);
    }

    @Test
    public void testLog(){
        logger.trace("tr");
        logger.info("info");
        logger.warn("warn");

    }

}