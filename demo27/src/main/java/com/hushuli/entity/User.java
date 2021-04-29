package com.hushuli.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private Long age;
}
