package com.example.xiaotao.mapper;

import com.example.xiaotao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from User where uid=#{uid}")
    public User selectUserById(Integer uid);
}
