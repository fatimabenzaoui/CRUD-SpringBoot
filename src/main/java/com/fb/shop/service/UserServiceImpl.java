package com.fb.shop.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.fb.shop.dao.UserRepository;
import com.fb.shop.model.User;
import lombok.AllArgsConstructor;


@Service @AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long userId) {
        return this.userRepository.findById(userId);
    }

    @Override
    public void updateById(User user, Long userId) {
        Optional<User> optionalUser = this.userRepository.findById(userId);
        if (optionalUser.isPresent()) {
           User existingUser = optionalUser.get();
           
           existingUser.setFirstName(user.getFirstName());
           existingUser.setLastName(user.getLastName());
           existingUser.setUsername(user.getUsername());
           existingUser.setPassword(user.getPassword());
           existingUser.setEmail(user.getEmail());
           
           this.userRepository.save(existingUser);
        }
        
    }

    @Override
    public void deleteById(Long userId) {
        this.userRepository.deleteById(userId);
    }

}
