package com.example.jcasbin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yx-0176
 * @description
 * @date : 2021/1/20
 */
@RestController
public class contorller {

    @Autowired
    private EnforcerFactory enforcerFactory;
    @GetMapping("/host/test")
    public void Test(){
        enforcerFactory.addPolicy(new Policy("alice", "/test", "GET"));
    }

    @GetMapping("/test")
    public String test1(){
        return "alice";
    }

}
