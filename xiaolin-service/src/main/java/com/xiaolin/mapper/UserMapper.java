package com.xiaolin.mapper;

import com.xiaolin.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    int insert(User user);

    User loadByMobileLogin(@Param("mobile") String mobile, @Param("password") String password);

    User load(@Param("userId") Long userId);

}
