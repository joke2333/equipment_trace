package com.domain.cms;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 设备实体类
 */
@Data
@ToString
public class Equipment implements Serializable {

    private Integer id ;
    private Date createTime;
    private Date updateTime;
    private String createUid;   // 创建人
    private String updateUid;   // 修改人
    private Integer isDeliver;  // 设备状态
    private Integer stageId;    // 设备阶段
    private String customerName;// 所属用户
    private String orderId;     // 订单号
    private Integer equipmentId;// 设备号
    private String remarks;     // 备注
    private Integer categoryId; // 设备分类号
    private Integer TypeId;     // 设备型号
    private String equipmentName;        // 设备名

}
