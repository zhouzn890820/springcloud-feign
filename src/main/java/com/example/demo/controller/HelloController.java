package com.example.demo.controller;

import com.example.demo.sevice.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Morange on 2018/1/31.
 */
@RestController
public class HelloController {
    @Resource
    HelloService helloService;
    @RequestMapping(value = "feign-hello",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }
    @RequestMapping(value = "feign-hello1",method = RequestMethod.GET)
    public String helloConsumer1(){
        return helloService.hello1("zhouzn","22");
    }
}
