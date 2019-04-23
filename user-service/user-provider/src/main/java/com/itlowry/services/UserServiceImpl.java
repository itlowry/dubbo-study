package com.itlowry.services;

import com.itlowry.dto.UserRequest;
import com.itlowry.dto.UserResponse;

public class UserServiceImpl implements IUserService {

    @Override
    public UserResponse getUser(UserRequest request) {

        String uid = request.getUid();
        UserResponse response =new UserResponse();
        response.setUid(uid);
        response.setAge(24);
        response.setUserName("张三");
        response.setSex(0);

        return response;
    }
}
