package com.pyl.service.impl;

import com.pyl.dao.UserDao;
import com.pyl.dao.impl.UserDaoImpl;
import com.pyl.service.UserService;

/**
 * @Description
 * @Author 彭雨蕾
 * @Date Created in 2020/7/4
 */
public class UserServiceImpl implements UserService {
    @Override
    public void findAll() {
        UserDao userDao = new UserDaoImpl();
        System.out.println("userService调用findAll方法");
        userDao.findAll();
    }
}
