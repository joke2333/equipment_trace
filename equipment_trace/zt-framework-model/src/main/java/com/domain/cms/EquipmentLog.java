package com.domain.cms;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备记录实体类
 */
@Data
@ToString
public class EquipmentLog implements Serializable {
    private Integer id;
    private String equipment;   // 设备号
    private Integer uid;        // 修改用户id
    private String username;    // 修改用户名
    private Date updateTime;    // 修改时间
    private String updateField; // 修改字段
    private String oldValue;    // 修改前
    private String newValue;    // 修改后
    private String ip;          // ip
}
