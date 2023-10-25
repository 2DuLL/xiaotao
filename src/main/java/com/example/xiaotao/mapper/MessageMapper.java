package com.example.xiaotao.mapper;


import com.example.xiaotao.entity.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MessageMapper {
    @Insert("insert into msg values(#{fid},#{tid},#{msg})")
    public void insertMsg(String fid,String tid,String msg);

    @Select("select * from msg where userid=#{userid} or touserid=#{toUserid}")
    public List<Message> selectAllMsg(String userid, String toUserid);
}
