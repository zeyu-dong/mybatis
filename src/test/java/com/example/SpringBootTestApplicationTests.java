package com.example;

import com.example.mapper.MyUserMapper;
import com.example.mapper.UserMapper;
import com.example.mapper.UserMapper1;
import com.example.pojo.User;
import com.example.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;
import java.util.List;

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

}
