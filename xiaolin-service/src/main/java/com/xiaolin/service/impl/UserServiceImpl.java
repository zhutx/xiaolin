package com.xiaolin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaolin.domain.User;
import com.xiaolin.fish.common.rpc.ServiceResponse;
import com.xiaolin.fish.common.utils.BeanUtils;
import com.xiaolin.manager.UserManager;
import com.xiaolin.model.UserInfo;
import com.xiaolin.request.LoginRequest;
import com.xiaolin.request.RegisterRequest;
import com.xiaolin.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserManager userManager;

    @Override
    public ServiceResponse<Long> register(RegisterRequest request) {
        Long result = userManager.register(request);
        return new ServiceResponse<>(true, null, result);
    }

    private UserInfo userToUserInfo(User user) {
        if (user == null) return null;
        return BeanUtils.copyProperties(UserInfo.class, user);
    }

    @Override
    public ServiceResponse<UserInfo> login(LoginRequest request) {
        User user = userManager.login(request);
        return new ServiceResponse<>(true, null, userToUserInfo(user));
    }

    @Override
    public UserInfo getUser(Long userId) {
        User user = userManager.getUser(userId);
        return userToUserInfo(user);
    }
}
