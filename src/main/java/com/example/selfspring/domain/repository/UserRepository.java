package com.example.selfspring.domain.repository;

import com.example.selfspring.domain.entity.User;

public interface UserRepository {

    /**
     * 根据Id查询
     * @return
     */
    User findById();

    /**
     * 保存
     * @return
     */
    Integer save(User user);

    /**
     * 删除
     */
    Integer delete();
}
