package com.fb.shop.service;

import java.util.List;
import java.util.Optional;

import com.fb.shop.model.User;

public interface UserService {
    User save(User user);
    List<User> findAll();
    Optional<User> findById(Long userId);
    void updateById(User user, Long userId);
    void deleteById(Long userId);
}
