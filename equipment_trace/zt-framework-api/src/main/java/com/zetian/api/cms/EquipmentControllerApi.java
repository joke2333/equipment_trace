package com.zetian.api.cms;

import com.domain.base.ResponseResult;
import com.domain.cms.Equipment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 设备控制接口
 */
@Api(value = "设备管理接口", description = "提供设备的增、删、改、查")
public interface EquipmentControllerApi {

    /**
     * 根据id查询设备
     * @param id
     * @return
     */
    @ApiOperation("根据id查询设备")
    public Equipment findById(Integer id);

    /**
     *
     * @param equipment
     * @return
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name = "equipment", value = "设备信息", required = false, paramType = "path", dataType = "Equipment"),
    })
    public ResponseResult add(Equipment equipment);

}
