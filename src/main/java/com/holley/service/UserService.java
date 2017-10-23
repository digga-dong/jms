package com.holley.service;

import com.holley.dao.UserDao;
import com.holley.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/23.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public int add(User user)
    {
        return userDao.insertUser(user);
    }
}
