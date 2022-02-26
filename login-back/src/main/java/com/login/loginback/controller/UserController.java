package com.login.loginback.controller;

import com.login.loginback.entity.User;
import com.login.loginback.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("")
    boolean getUsers(@RequestBody User user){
        return userService.verifyUserInfo(user);
    }
}
