package com.backend.repository;

import com.backend.model.User;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String username);
}
