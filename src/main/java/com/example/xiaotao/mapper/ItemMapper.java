package com.example.xiaotao.mapper;


import com.example.xiaotao.entity.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ItemMapper {
    @Select("select * from Item where iid=#{iid}")
    public Item selectItemByIid(Integer iid);
    @Insert("insert into Item values(#{iid},#{goodsName},#{content},#{imgList},#{orgprice},#{newprice},#{classify},#{newold})")
    public Boolean insertItem(Integer iid,String goodsName,String content,String imgList,Double orgprice,Double newprice,String classify,String newold);
}
