package com.example.xiaotao.service;

import com.example.xiaotao.entity.Item;

import java.util.List;

public interface UserItemService {
    public List<Item> selectItemByUid(Integer uid);
    public Boolean insertRecord(Integer uid,Integer iid);
}
