package com.demo.service.impl;

import com.demo.service.UserService;
import com.demo.dao.UserDao;
import com.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findUser(User parameterUser) throws Exception {
        //1. 判断用户名是否正确: 调用dao层的方法，根据用户名查找用户
        User loginUser = userDao.findUserByUsername(parameterUser.getUsername());
        if (loginUser != null) {
            //用户名正确
            //2. 判断密码是否正确 : 使用parameterUser的密码和loginUser的密码进行校验
            if (parameterUser.getPassword().equals(loginUser.getPassword())) {
                //密码正确
                return loginUser;
            }else {
                //密码错误
                throw new RuntimeException("密码错误");
            }
        }else {
            //用户名错误
            throw new RuntimeException("用户名错误");
        }
    }
}
