package org.sunyifei.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sunyifei.service.service.ProductManageImp;

@RestController
@Component
public class TestController {
    @Autowired
    ProductManageImp productManageImp;
    @GetMapping("/ss")
    public Boolean ss(){
        boolean r = productManageImp.getUpMapper();
        return r;
    }
    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好，nacos！";
    }
    @GetMapping("/product")
    public Boolean Product(){
        productManageImp.getUpMapper();
        return true;
    }
}
