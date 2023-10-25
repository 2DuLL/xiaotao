package com.example.xiaotao;

import com.example.xiaotao.entity.Item;
import com.example.xiaotao.entity.User;
import com.example.xiaotao.mapper.UserItemMapper;
import com.example.xiaotao.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class XiaotaoApplicationTests {


    @Autowired
    UserMapper userMapper;


//    @Test
//    void testSel() {
//        User user = userMapper.selectById(1);
//        System.out.println(user);
//    }
//
//    @Autowired
//    UserItemMapper userItemMapper;
//
//    @Test
//    void  ownItem(){
//        Item item = userItemMapper.selectItemByUser(1);
//        System.out.println(item);
//
//    }

}
