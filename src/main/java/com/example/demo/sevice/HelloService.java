package com.example.demo.sevice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Morange on 2018/1/31.
 */
@FeignClient(value = "eureka-client",fallback = HelloServiceFallback.class)
public interface HelloService {
    @RequestMapping("/hello")
    String hello();
    @RequestMapping(value = "hello1",method = RequestMethod.GET)
    String hello1(@RequestParam("name") String name,@RequestParam("age") String age);
}
