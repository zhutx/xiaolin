package com.xiaolin.manager;

import com.xiaolin.domain.User;
import com.xiaolin.request.LoginRequest;
import com.xiaolin.request.RegisterRequest;

public interface UserManager {

    Long register(RegisterRequest request);

    User login(LoginRequest request);

    User getUser(Long userId);


}
