package com.base.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.base.user.service.UserService;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void queryUserInfo() {
        System.out.println("服务ok");
    }
}
