package com.example.selfspring.domain.factory;

import com.example.selfspring.domain.entity.User;

/**
 * zhiyang
 */

public interface UserFactory {

    User create(Integer id,String userName, String userCount, String userPassword);
}
