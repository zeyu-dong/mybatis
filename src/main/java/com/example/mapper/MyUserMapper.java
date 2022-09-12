package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MyUserMapper {

    List<User> selectAllWebsite();

    User selectByIdAndName(int i, String s);

    void insetUser(User user);

    Map<String, Object> getUsersToMap(int id);

    List< User> getUsersByLike();

    void insertUserAndGetIncrementKey(User user);
}
