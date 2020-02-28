package com.kk.controller;

import com.kk.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kk
 * @Date: 2020-02-19 21:01
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/info")
    public String userInfoAction(@RequestParam String userName, @RequestParam Integer age) {
        return userService.getUserInfo(userName, age);
    }
}
