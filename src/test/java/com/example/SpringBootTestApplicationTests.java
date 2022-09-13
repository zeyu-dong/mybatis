package com.example;

import com.example.mapper.CacheMapper;
import com.example.mapper.MyUserMapper;
import com.example.mapper.UserMapper;
import com.example.mapper.UserMapper1;
import com.example.pojo.User;
import com.example.service.IUserService;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootTest
class SpringBootTestApplicationTests {


    @Autowired
    private IUserService userService;


    @Autowired
    private UserMapper1 userMapper1;

    @Autowired
    private MyUserMapper myUserMapper;
    @Autowired
    private MyUserMapper myUserMapper1;
    @Test
    void contextLoads() {
        List<User> users = myUserMapper.selectAllWebsite();
        for (User user : users) {
            System.out.println(user.getName());

        }
    }

    @Test

    public void testIdAndName() {
        User maozi = new User( 12306, "zaima");
        myUserMapper.insertUserAndGetIncrementKey(maozi);

        System.out.println(maozi);
    }

    @Autowired
    private CacheMapper cacheMapper;
    @Autowired
    private CacheMapper cacheMapper1;
    @Test
    @Transactional
    public void testCache() {
        User userById = cacheMapper.findUserById(2);
        System.out.println(userById);

        User userById1 = cacheMapper.findUserById(2);
        System.out.println(userById1);
    }

    @Test

    public void testSecondCache() {
        User userById = cacheMapper.findUserById(2);
        User userById1 = cacheMapper1.findUserById(2);
    }

}
