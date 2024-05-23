package com.fb.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fb.shop.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
