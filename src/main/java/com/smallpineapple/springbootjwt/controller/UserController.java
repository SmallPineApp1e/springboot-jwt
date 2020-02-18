package com.smallpineapple.springbootjwt.controller;

import com.smallpineapple.springbootjwt.entity.User;
import com.smallpineapple.springbootjwt.service.UserService;
import com.smallpineapple.springbootjwt.util.ResultUtil;
import com.smallpineapple.springbootjwt.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zeng
 * @date 2020/2/16 22:24
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResultUtil login(String username, String password){
        User dbUser = userService.findUserByUsernameAndPassword(username, password);
        if (dbUser == null) {
            return ResultUtil.failure().addObject("err", "用户名或密码错误!");
        }
        //获取token
        String token = TokenUtil.getToken(dbUser);
        //返回给客户端保存
        return ResultUtil.success().addObject("token", token).addObject("user",dbUser);
    }

    @GetMapping("/admin/test")
    public ResultUtil testMethod(){
        return ResultUtil.success();
    }

}
