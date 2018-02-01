//package com.example.demo.config;
//
//import feign.Feign;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
///**
// * Created by Morange on 2018/1/31.
// * 禁用熔断配置类，在@FeignClient中 configuration引入
// */
//@Configuration
//public class DisableHystrixConfiguration  {
//    @Bean
//    @Scope("prototype")
//    public Feign.Builder feignBuild(){
//        return Feign.builder();
//    }
//}
