package com.hushuli.repository;

import com.hushuli.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User getById(long id);
}
