package com.example.selfspring.domain.entity;

import lombok.*;

/**
 * @author: zhiyang
 * @description: 用户类
 * @create: 2021-11-26 14:13
 **/

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class User {

    private Integer id;

    private String userName;

    private String userCount;

    private String userPassword;

}
