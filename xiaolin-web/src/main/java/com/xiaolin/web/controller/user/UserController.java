package com.xiaolin.web.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaolin.fish.common.utils.BeanUtils;
import com.xiaolin.fish.common.utils.Validator;
import com.xiaolin.fish.common.web.BaseResponse;
import com.xiaolin.request.RegisterRequest;
import com.xiaolin.service.UserService;
import com.xiaolin.web.controller.BaseController;
import com.xiaolin.web.controller.user.request.RegisterModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/user")
public class UserController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Reference
    private UserService userService;

    private RegisterRequest buildRequest(RegisterModel model) {
        return BeanUtils.copyProperties(RegisterRequest.class, model);
    }

    @RequestMapping(value="/register", method= RequestMethod.POST)
    @ResponseBody
    public BaseResponse register(@RequestBody RegisterModel model) {
        if (!Validator.isMobile(model.getMobile())) return new BaseResponse("1", "手机号有误");
        userService.register(buildRequest(model)).pickDataThrowException();

        return new BaseResponse();
    }

}
