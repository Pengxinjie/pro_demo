package com.demo.controller;
import com.demo.service.UserService;
import com.demo.constants.Constants;
import com.demo.entity.Result;
import com.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public Result login(@RequestBody User parameterUser, HttpSession session) throws IOException {
        try {
            //调用业务层的方法，校验用户名和密码
            User loginUser = userService.findUser(parameterUser);

            //保存登录状态!!!!将loginUser存储到session中
            session.setAttribute(Constants.USER_SESSION_KEY,loginUser);

            //没有出现异常，说明登录成功
            return new Result(true,"登录成功",loginUser);
        } catch (Exception e) {
            e.printStackTrace();
            //出现异常说明登录失败
            return new Result(false,e.getMessage());
        }
    }

    @RequestMapping(value = "/logout")
    public Result logout(HttpSession session) throws IOException {
        try {
            //清除登录状态
            session.invalidate();

            return new Result(true,"退出登录成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"退出登录失败");
        }
    }
}
