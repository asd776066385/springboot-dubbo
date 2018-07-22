package com.base.user.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.base.user.service.TestService;
import com.base.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl  implements TestService{

    @Reference
   private UserService userService;

    @Override
    public void testReService() {
        System.out.println("*********消费方开始调用dubbo远程服务");
        userService.queryUserInfo();
        System.out.println("**********消费方调用dubbo远程服务结束");
    }
}
