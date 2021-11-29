package com.example.selfspring.domain.factory.impl;

import com.example.selfspring.domain.entity.User;
import com.example.selfspring.domain.factory.UserFactory;

/**
 * @author: zhiyang
 * @description: 实例工厂实现类
 * @create: 2021-11-26 18:49
 **/


public class UserFactoryImpl implements UserFactory {
    @Override
    public User create(Integer id, String userName, String userCount, String userPassword) {
        return User.builder()
                .id(id)
                .userName(userName)
                .userCount(userCount)
                .userPassword(userPassword)
                .build();
    }
}
