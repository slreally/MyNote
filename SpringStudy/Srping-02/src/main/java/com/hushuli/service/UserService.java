package com.hushuli.service;

import com.hushuli.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public void add();
    public void delete();
    public void update();
}
