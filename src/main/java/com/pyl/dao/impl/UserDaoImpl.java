package com.pyl.dao.impl;

import com.pyl.dao.UserDao;

/**
 * @Description
 * @Author 彭雨蕾
 * @Date Created in 2020/7/4
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("从数据库中拿数据");
    }
}
