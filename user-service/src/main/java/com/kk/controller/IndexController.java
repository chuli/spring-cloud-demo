package com.kk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kk
 * @Date: 2020-02-19 21:07
 */

@RestController
@RequestMapping("")
public class IndexController {

    @RequestMapping("")
    public String IndexAction() {
        return "This is user service !!!";
    }
}
