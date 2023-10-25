package com.example.xiaotao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    Integer iid; //商品id
    String goodsName;
    String content;
    String imgList;
    Double orgprice;
    Double newprice;
    String classify;
    String newold;

}
