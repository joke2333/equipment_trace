package com.zetian.cms.dao;

import com.domain.cms.Equipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EquipmentRepository {

    @Select("select * from tb_equipment where id = #{id}")
    public Equipment findById(Integer id);

    @Select("select * from tb_equipment")
    public List<Equipment> findAll();
}
