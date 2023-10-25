package com.example.xiaotao.service;


import com.example.xiaotao.entity.Item;
import com.example.xiaotao.mapper.UserFavouriteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFavouriteServiceImpl implements UserFavouriteService {
    @Autowired
    UserFavouriteMapper userFavouriteMapper;

    @Override
    public List<Item> selectUserFavouriteItem(Integer uid) {
        List<Item> items = userFavouriteMapper.selectUserFavouriteItem(uid);
        return items;
    }
}
