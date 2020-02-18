package com.smallpineapple.springbootjwt.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.smallpineapple.springbootjwt.entity.User;

import java.util.Date;

/**
 * @author Zeng
 * @date 2020/2/17 10:56
 */
public class TokenUtil {
    //设置过期时间为1个小时
    private static final Long EXPIRE_TIME = Long.valueOf(1*1000);

    public static String getToken(User user){
        String token="";
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + EXPIRE_TIME);
        token= JWT.create().withAudience(String.valueOf(user.getId()))
                .withExpiresAt(date)
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }

}
