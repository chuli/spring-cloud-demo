package com.kk.service.impl;

import com.kk.service.UserService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: kk
 * @Date: 2020-02-19 20:57
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserInfo(String userName, int age) {
        return "username " + userName + " and age is " + age;
    }
}
