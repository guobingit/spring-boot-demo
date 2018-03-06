package com.kimi.demo.dao;

import com.kimi.demo.entity.User;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends BaseMapper<User> {

    @Sql("select * from user")
    List<User> findAll();
}
