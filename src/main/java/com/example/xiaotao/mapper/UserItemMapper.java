package com.example.xiaotao.mapper;


import com.example.xiaotao.entity.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserItemMapper {


    @Select("select * from Item where iid in (select iid from user_item where uid=#{uid})")
    public List<Item> selectItemByUser(Integer uid);
    @Insert("insert into Item values(#{uid},#{iid})")
    public Boolean insertUserItem(Integer uid,Integer iid);
}
