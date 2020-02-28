package com.kk.infrastructure.remote.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: kk
 * @Date: 2020-02-28 11:47
 */

@FeignClient(name = "user-service")
public interface UserFeignService {

    @RequestMapping(value = "/user/info")
    public String userInfo(@RequestParam(value = "userName") String userName, @RequestParam(value = "age") int age);
}
