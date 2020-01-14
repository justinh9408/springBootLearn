package com.hjc.bean;

/**
 * @Classname Dog
 * @Description TODO
 * @Date 2020-01-13 22:33
 * @Created by Justin
 */
public class Dog {
    String name;
    Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
