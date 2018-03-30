package com.xiaolin.service;

import com.xiaolin.fish.common.rpc.ServiceResponse;
import com.xiaolin.model.UserInfo;
import com.xiaolin.request.LoginRequest;
import com.xiaolin.request.RegisterRequest;

public interface UserService {

    ServiceResponse<Long> register(RegisterRequest request);

    ServiceResponse<UserInfo> login(LoginRequest request);

    UserInfo getUser(Long userId);


}
