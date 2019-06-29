package com.qf.j1902.service.Impl;

import com.qf.j1902.mapper.UserMapper;
import com.qf.j1902.pojo.User;
import com.qf.j1902.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by asus on 2019/6/29.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByName(String username) {
        User user = userMapper.getUserByName(username);
        return user;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);

    }
}
