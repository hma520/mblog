package org.kingxkm.mblog.service;

import com.alibaba.fastjson.JSON;
import org.junit.runner.RunWith;
import org.kingxkm.mblog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class UserServiceTest {

    @Autowired
    UserService userService;
    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("Test数据初始化......");
        for (int i = 1; i <= 10; i++) {
            User u = new User();
            u.setUsername("用户B"+i);
            u.setPassword("密码B"+i);
            System.out.println(JSON.toJSONString(userService.addUser(u)));
        }
        System.out.println("Test数据初始化完成.");
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testGetAllUser() throws Exception {
        System.out.println(JSON.toJSONString(userService.getAllUser()));
    }

    @org.junit.Test
    public void testGetUser() throws Exception {
        System.out.println("testGetUser() 调用");
        System.out.println(userService.getUser(2l));;
    }

    @org.junit.Test
    public void testDeleteUser() throws Exception {

    }

    @org.junit.Test
    public void testAddUser() throws Exception {

    }
}