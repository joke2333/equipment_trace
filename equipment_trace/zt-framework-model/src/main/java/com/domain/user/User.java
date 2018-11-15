package com.domain.user;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 用户实体类
 */
@Data
@ToString
public class User implements Serializable {
    private Integer uid;
    private String username;    // 用户名
    private String password;    // 密码
    private String department;  // 部门
    private String post;        // 岗位
    private String authority;   // 权限
    private String ip;          // ip
    private String nickName;    // 昵称
}
