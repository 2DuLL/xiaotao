package com.example.xiaotao.service;

import com.example.xiaotao.entity.Item;

import java.util.List;

public interface UserFavouriteService {
    public List<Item> selectUserFavouriteItem(Integer uid);
}
