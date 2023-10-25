package com.example.xiaotao.mapper;


import com.example.xiaotao.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserFavouriteMapper {

    @Select("select * from Item where iid in (select iid from user_favourite where uid=#{uid})")
    public List<Item> selectUserFavouriteItem(Integer uid);
}
