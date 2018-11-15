package com.domain.user;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 部门表
 */
@Data
@ToString
public class Department implements Serializable {
    private Integer uid;
    private String department;
}
