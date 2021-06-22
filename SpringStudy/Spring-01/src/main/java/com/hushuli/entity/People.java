package com.hushuli.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class People {
    //@Autowired 是使用注解实现自动装配
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
}
