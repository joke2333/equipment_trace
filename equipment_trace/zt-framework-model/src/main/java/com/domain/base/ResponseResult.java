package com.domain.base;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 前后端交互类
 */
@Data
@ToString
public class ResponseResult implements Serializable {
    private Boolean success;
    private String message;
    private Object date;
}
