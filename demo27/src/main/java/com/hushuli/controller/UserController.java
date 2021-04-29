package com.hushuli.controller;

import com.hushuli.entity.User;
import com.hushuli.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }
    @GetMapping("findById/{id}")
    public User findById(@PathVariable("id") long id){
        return userRepository.findById(id);
    }
    @PostMapping("save")
    public void save(@RequestBody User user){
        userRepository.save(user);
    }
    @PutMapping("update")
    public void update(@RequestBody User user){
        userRepository.update(user);
    }
    @DeleteMapping("deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        userRepository.deleteById(id);
    }
}
