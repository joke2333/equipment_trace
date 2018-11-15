package com.zetian.cms;

import com.domain.cms.Equipment;
import com.zetian.cms.dao.EquipmentRepository;
import lombok.ToString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest("ApplicationCms")
public class TestRepository {

    @Autowired
    private EquipmentRepository equipmentRepository;

    // 测试
    @Test
    public void findByIdTest(){
        Equipment byId = equipmentRepository.findById(2);
        System.out.println(byId);
    }

    @Test
    public void findAllTest(){
        List<Equipment> all = equipmentRepository.findAll();
        System.out.println(all);
    }
}
