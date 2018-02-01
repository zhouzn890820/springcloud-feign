package com.example.demo.sevice;

import org.springframework.stereotype.Component;

/**
 * Created by Morange on 2018/1/31.
 */
@Component
public class HelloServiceFallback implements HelloService{
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello1(String name, String age) {
        return "unknow-->**";
    }
}
