-- 数据库初始化脚本

-- 创建数据库
DROP DATABASE IF EXISTS lilybbs;

CREATE DATABASE lilybbs character set utf8;
-- 使用数据库
USE lilybbs;

-- 创建用户表
CREATE TABLE user(
    `id` int NOT NULL AUTO_INCREMENT COMMENT '自增id',
    `user_id` VARCHAR(50) NOT NULL COMMENT '用户id',
    `user_name` VARCHAR(100) NOT NULL COMMENT '用户昵称',
    `login_times` int NOT NULL COMMENT '上站次数',
    `post_articles` int NOT NULL COMMENT '发表文章数',
    `title` VARCHAR(50) COMMENT '站内职务',
    `constellation` VARCHAR(20) COMMENT '星座',
    `last_login_time` timestamp NOT NULL COMMENT '最后上站时间',
    `last_login_ip` VARCHAR(20) NOT NULL COMMENT '最后上站IP',
    `experience` int NOT NULL COMMENT '经验值',
    `performance` int NOT NULL COMMENT '表现值',
    `life` int NOT NULL COMMENT '生命值',
    `moderators` VARCHAR(500) COMMENT '担任版主的版面（使用,隔开）',
    `exist` BOOLEAN NOT NULL DEFAULT TRUE COMMENT '该用户是否存在,默认存在',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- 创建登录信息表
CREATE TABLE logininfo(
    `user_id` VARCHAR(50) NOT NULL COMMENT '用户id',
    `login_time` timestamp NOT NULL COMMENT '上站时间',
    `login_ip` VARCHAR(20) NOT NULL COMMENT '上站IP',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY(`user_id`, `login_time`, `login_ip`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登录信息表';
