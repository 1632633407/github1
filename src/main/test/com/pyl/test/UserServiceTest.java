package com.pyl.test;

import com.pyl.service.UserService;
import com.pyl.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * @Description
 * @Author 彭雨蕾
 * @Date Created in 2020/7/4
 */
public class UserServiceTest {
    @Test
    public void test() {
        UserService userService = new UserServiceImpl();
        userService.findAll();
    }
}
