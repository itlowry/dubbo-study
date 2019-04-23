package com.itlowry.services;

import com.itlowry.dto.UserRequest;
import com.itlowry.dto.UserResponse;

public interface IUserService {
    UserResponse getUser(UserRequest request);
}
