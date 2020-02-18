package com.smallpineapple.springbootjwt.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Zeng
 * @date 2020/2/16 22:25
 */
@Table(name = "user")
@Entity
@Data
public class User {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

}
