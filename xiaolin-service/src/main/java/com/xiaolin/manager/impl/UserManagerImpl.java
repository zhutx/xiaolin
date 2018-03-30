package com.xiaolin.manager.impl;

import com.xiaolin.domain.User;
import com.xiaolin.emnus.UserStatus;
import com.xiaolin.emnus.XiaolinErrorCode;
import com.xiaolin.fish.common.exception.BizAssert;
import com.xiaolin.fish.common.utils.BeanUtils;
import com.xiaolin.fish.common.utils.ExceptionUtils;
import com.xiaolin.manager.UserManager;
import com.xiaolin.mapper.UserMapper;
import com.xiaolin.request.LoginRequest;
import com.xiaolin.request.RegisterRequest;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserMapper userMapper;
//    @SI
//    private IdgeneratorService idgeneratorService;

//    private Long genPrimaryKey(String name) {
//        return idgeneratorService.getNextIdByTypeName(name).getData();
//    }

    private User requestToDomain(RegisterRequest request) {
        User user = BeanUtils.copyProperties(User.class, request);
        //user.setUserId(genPrimaryKey(User.class.getName()));
        user.setUserId(Long.parseLong(RandomStringUtils.randomNumeric(19)));
        user.setUsername(user.getMobile());
        user.setStatus(UserStatus.ENABLE.getValue());
        return user;
    }

    @Override
    public Long register(RegisterRequest request) {
        BizAssert.notNull(request.getMobile(), "mobile is required");
        BizAssert.notNull(request.getPassword(), "passwd is required");

        User user = requestToDomain(request);
        userMapper.insert(user);

        return user.getUserId();
    }

    @Override
    public User login(LoginRequest request) {
        BizAssert.notNull(request.getMobile(), "mobile is required");
        BizAssert.notBlank(request.getPassword(), "password is required");

        User user = userMapper.loadByMobileLogin(request.getMobile(), request.getPassword());
        if (user == null) ExceptionUtils.throwException(XiaolinErrorCode.ACCOUNT_FAIL, XiaolinErrorCode.ACCOUNT_FAIL.getMessage());

        if (UserStatus.DISABLE.getValue() == user.getStatus()) ExceptionUtils.throwException(XiaolinErrorCode.ACCOUNT_DISABLE, XiaolinErrorCode.ACCOUNT_DISABLE.getMessage());

        return user;
    }

    @Override
    public User getUser(Long userId) {
        BizAssert.notNull(userId);
        return userMapper.load(userId);
    }

}
