package com.demo.login.service.impl;

import com.demo.login.repository.UserRepository;
import com.demo.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String login(String email, String password) {
        return userRepository.findByEmail(email)
                .map(user -> user.getPassword().equals(password) ?
                        "Login Successful" : "Invalid Credentials")
                .orElse("Invalid Credentials");
    }
}
