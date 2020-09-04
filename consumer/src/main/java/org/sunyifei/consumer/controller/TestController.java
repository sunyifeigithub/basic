package org.sunyifei.consumer.controller;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.sunyifei.consumer.service.OrderManageImp;
import org.sunyifei.consumer.service.RemoteService;

import javax.annotation.Resource;
@RestController
public class TestController {
    @Autowired
    RemoteService remoteService;
    @Autowired
    OrderManageImp orderManageImp;
    @GetMapping("/feign1")
    public String test1() {
        return remoteService.helloNacos();
    }
    @GetMapping("/feign2/{order_id}")
    //@GlobalTransactional
    public boolean test2(@PathVariable(name = "order_id") Integer id) {
        System.out.println("sssss"+id);
        orderManageImp.doInMapper(id);
        //Integer a = null;
        //int b = a;
        System.out.println("qqqqqqq");
        //remoteService.Product();
        return true;
    }
    @GetMapping("/feign3/{order_id}")
    public boolean test3(@PathVariable(name = "order_id") Integer id) {
        System.out.println("sssss"+id);
        orderManageImp.doInMapper(id);
        System.out.println("qqqqqqq");
        return true;
    }


}
