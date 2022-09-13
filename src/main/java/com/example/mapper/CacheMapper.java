package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CacheMapper {
    User findUserById(int id);
}
