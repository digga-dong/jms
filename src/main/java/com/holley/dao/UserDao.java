package com.holley.dao;

import com.holley.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/10/23.
 */
@Mapper
public interface UserDao {

    int insertUser(@Param("user") User user);

    User findByName(String name);
}
