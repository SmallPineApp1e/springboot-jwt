package com.smallpineapple.springbootjwt.service;

import com.smallpineapple.springbootjwt.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author Zeng
 * @date 2020/2/17 11:08
 */
public interface UserService {

    User findUserByUsernameAndPassword(String username, String password);

    User findUserById(Long id);

}
