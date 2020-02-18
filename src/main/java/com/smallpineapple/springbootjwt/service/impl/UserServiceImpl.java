package com.smallpineapple.springbootjwt.service.impl;

import com.smallpineapple.springbootjwt.dao.UserRepository;
import com.smallpineapple.springbootjwt.entity.User;
import com.smallpineapple.springbootjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * @author Zeng
 * @date 2020/2/17 11:09
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        User dbUser  = userRepository.findUserByUsernameAndPassword(username, password);
        return dbUser;
    }

    @Override
    public User findUserById(Long id) {
        User dbUser = userRepository.findById(id).get();
        return dbUser;
    }
}
