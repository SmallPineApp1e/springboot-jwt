package com.smallpineapple.springbootjwt.util;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Zeng
 * @date 2020/2/17 10:15
 */
public enum ResultSet {

    SUCCESS(200, "处理成功！"),
    FAIL(100,"处理失败！"),
    NOT_ALLOWED(1001, "尚未登陆认证！没有资格访问！")
    ;

    private Integer code;
    private String message;

    ResultSet(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
