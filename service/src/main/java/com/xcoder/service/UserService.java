package com.xcoder.service;

import com.xcoder.dao.UserDao;
import com.xcoder.dto.UserDto;

import java.util.Optional;

public class UserService {
    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id).map(it -> new UserDto());
    }
}
