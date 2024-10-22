package com.logan.curso.springboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import com.logan.curso.springboot.error.springboot_error.Models.domain.User;

public interface UserService {
    
    List<User> findAll();
    Optional<User> findById(Long id);
}
