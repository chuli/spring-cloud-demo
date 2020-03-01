package com.kk.userinterface.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: kk
 * @Date: 2020-02-29 23:02
 */

@RestController
@RequestMapping("/user/api")
public class UserApiController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.user.name}")
    private String userServiceName;

    @Value("${service.user.api.info}")
    private String infoApiPath;

    @RequestMapping("/info")
    public String userInfoAction(@RequestParam(name = "userName") String userName,
                                 @RequestParam(name = "age") int age) {
        String path = userServiceName + infoApiPath + "?userName=" + userName + "&age=" + age;
        String result = restTemplate.getForObject(path, String.class);

        return result;
    }
}
