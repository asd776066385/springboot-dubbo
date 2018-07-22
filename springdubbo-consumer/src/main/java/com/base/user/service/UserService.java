package com.base.user.service;

/**
 * 直接把远程服务接口类复制过来，dubbo远程调用是通过全类名
 */
public interface UserService {
    void queryUserInfo();
}
