package org.sunyifei.consumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@FeignClient(value = "service")
public interface RemoteService {
    @GetMapping("/helloNacos")
    String helloNacos();
    @GetMapping("/product")
    Boolean Product();
}
