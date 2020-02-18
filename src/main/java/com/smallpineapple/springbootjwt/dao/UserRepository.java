package com.smallpineapple.springbootjwt.dao;

import com.smallpineapple.springbootjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author Zeng
 * @date 2020/2/17 11:05
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsernameAndPassword(@Param(value = "username") String username,
                                       @Param(value = "password") String password);

}
