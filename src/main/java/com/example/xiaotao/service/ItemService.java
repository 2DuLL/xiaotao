package com.example.xiaotao.service;

import com.example.xiaotao.entity.Item;

public interface ItemService {
    public Item selectItemByIid(Integer iid);
    public Boolean createitem(Item item);
}
