package com.logan.curso.springboot.error.springboot_error.services;

import java.util.List;

import com.logan.curso.springboot.error.springboot_error.Models.domain.User;

public interface UserService {
    
    List<User> findAll();
    User findById(Long id);
}
