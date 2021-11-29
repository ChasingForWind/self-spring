
--新建数据库
create database self_spring
use self_spring


-- user 表建表语句
CREATE TABLE user(
                     ID INT NOT NULL AUTO_INCREMENT  COMMENT 'id' ,
                     USER_NAME VARCHAR(32)    COMMENT '用户名 用户名' ,
                     USER_COUNT VARCHAR(32)    COMMENT '用户账号 用户账号' ,
                     USER_PASSWORD VARCHAR(32)    COMMENT '用户密码 用户密码' ,
                     CREATED_TIME DATETIME   DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
                     UPDATED_TIME DATETIME   DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间' ,
                     PRIMARY KEY (ID)
) COMMENT = ' ';