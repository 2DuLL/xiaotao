package com.example.xiaotao.service;

import com.example.xiaotao.entity.Item;
import com.example.xiaotao.mapper.UserItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserItemServiceImpl implements  UserItemService {

    @Autowired
    UserItemMapper userItemMapper;

    @Override
    public List<Item> selectItemByUid(Integer uid) {

        return userItemMapper.selectItemByUser(uid);
    }

    @Override
    public Boolean insertRecord(Integer uid,Integer iid){
        return userItemMapper.insertUserItem(uid,iid);
    }
}
