package com.hushuli.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component 注解 等价于<bean id="user" class="com.hushuli.entity.User"/>
@Scope("prototype")
@Component
@Data
public class User {

    @Value("大乔")
    private String name;
}
