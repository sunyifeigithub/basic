package org.sunyifei.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.sunyifei.service.dao.ProductMapper;

@Service
@Repository
@Component
public class ProductManageImp implements ProductManage {
    @Autowired
    private ProductMapper productMapper;
    @Override
    @GetMapping("/ss")
    public boolean getUpMapper() {
        System.out.println("jjj");
        //Integer a = null;
        //int b = a;
        productMapper.Up();
        System.out.println("通过");
        return true;
    }

}
