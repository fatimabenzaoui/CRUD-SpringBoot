package com.fb.shop.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fb.shop.model.User;
import com.fb.shop.service.UserService;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PutMapping;



@RestController @AllArgsConstructor
@RequestMapping(path="/api")
public class UserController {

    private final UserService userService;

    @PostMapping(path="/user")
    public User save(@RequestBody User user) {
        return this.userService.save(user);
    }

    @GetMapping(path="/users")
    public List<User> findAll() {
        return this.userService.findAll();
    }

    @GetMapping(path="user/{userId}")
    public Optional<User> findById(@PathVariable Long userId) {
        return this.userService.findById(userId);
    }

    @PutMapping("user/{userId}")
    public void updateById(@RequestBody User user, @PathVariable Long userId) {
        this.userService.updateById(user, userId);
    }

    @DeleteMapping("user/{userId}")
    public void deleteById(@PathVariable Long userId) {
        this.userService.deleteById(userId);
    }
    
}
