package com.kk.userinterface.controller;

import com.kk.infrastructure.config.ConfigInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kk
 * @Date: 2020-03-02 18:18
 */

@RefreshScope
@RestController
@RequestMapping("config")
public class ConfigClientController {

    @Autowired
    private ConfigInfoProperties configInfoProperties;

    @RequestMapping("/getConfigInfo")
    public String configInfoAction() {
        return configInfoProperties.getConfig();
    }
}