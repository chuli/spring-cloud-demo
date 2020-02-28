package com.kk.userinterface.controller;

import com.kk.infrastructure.remote.feign.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kk
 * @Date: 2020-02-28 11:51
 */

@RestController
@RequestMapping("/admin-user")
public class UserController {

    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("/info")
    public String userInfoAction(@RequestParam(value = "userName") String userName,
                                 @RequestParam(value = "age") int age) {
        return userFeignService.userInfo(userName, age);
    }
}
