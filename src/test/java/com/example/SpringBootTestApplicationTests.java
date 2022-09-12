package com.example;

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
    @Test
    public void testCache() {
        

    }

}
