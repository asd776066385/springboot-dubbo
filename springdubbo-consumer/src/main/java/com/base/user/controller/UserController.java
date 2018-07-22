package com.base.user.controller;

import com.base.user.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private TestService testService;

    @GetMapping("/user/testrpc")
    public String qetFromRpc(){
        testService.testReService();
        return "dubbo rpc 调用成功";
    }
}
