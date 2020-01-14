package com.hjc;

import com.hjc.bean.Person;
import com.hjc.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
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

    @Autowired
    Person person;


    @Test
    public void testContext(){
        System.out.println(person);
    }
}