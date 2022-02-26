package com.login.loginback.service;


import com.login.loginback.entity.User;
import com.login.loginback.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public boolean verifyUserInfo(User user){
        return getAllUsers().stream().anyMatch(x -> x.getUsername().equals(user.getUsername()) && x.getPwd().equals(user.getPwd()));
    }
}
