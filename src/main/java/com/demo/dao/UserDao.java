package com.demo.dao;

import com.demo.pojo.User;

public interface UserDao {
    User findUserByUsername(String username);
}
