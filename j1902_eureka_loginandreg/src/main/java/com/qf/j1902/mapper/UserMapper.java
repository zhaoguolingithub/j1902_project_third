package com.qf.j1902.mapper;

import com.qf.j1902.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by asus on 2019/6/29.
 */
@Mapper
public interface UserMapper {
    public User getUserByName(String username);
    public void addUser(User user);
}
