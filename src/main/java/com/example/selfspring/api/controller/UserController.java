package com.example.selfspring.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhiyang
 * @description: 用户接口
 * @create: 2021-11-26 13:56
 **/

@RestController
public class UserController {

    @GetMapping("/getName")
    public String getName(
            @RequestParam(required=false, value = "userId", defaultValue = "1") Integer userId){
        return "hello world";
    }
}
