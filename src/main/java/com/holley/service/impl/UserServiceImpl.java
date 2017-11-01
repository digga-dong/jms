package com.holley.service.impl;

import com.holley.mapper.ProductinfoMapper;
import com.holley.mapper.UserDao;
import com.holley.model.ProductinfoWithBLOBs;
import com.holley.model.User;
import com.holley.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/10/23.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public int add(User user)
    {
        return userDao.insertUser(user);
    }


}
