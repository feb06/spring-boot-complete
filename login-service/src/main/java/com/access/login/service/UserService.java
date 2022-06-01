package com.access.login.service;

import com.access.login.entity.User;
import com.access.login.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User registerUser(UserModel userModel);
}
