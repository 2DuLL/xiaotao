package com.example.xiaotao.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ItemPictureMapper {


    @Select("select picture_url from item_picture where iid=#{iid}")
    public List<String> selectPictureByItem(Integer iid);
    @Insert("insert into item_picture values(#{iid},#{imgurl})")
    public Boolean insertItemPicture(Integer iid,String imgurl);
}
