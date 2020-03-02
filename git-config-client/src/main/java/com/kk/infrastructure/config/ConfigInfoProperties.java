package com.kk.infrastructure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Author: kk
 * @Date: 2020-03-02 18:11
 */

// 被@RefreshScope修饰的Bean是延迟加载的，只有在第一次访问时才会被初始化，刷新Bean也是同理，下次访问会创建一个新的对象
@RefreshScope
@Component
public class ConfigInfoProperties {

    @Value("${com.kk.demo.config}")
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
