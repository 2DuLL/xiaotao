package com.example.xiaotao.service;

import com.example.xiaotao.entity.Item;
import com.example.xiaotao.mapper.ItemMapper;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemMapper itemMapper;

    @Override
    public Item selectItemByIid(Integer iid) {
        return itemMapper.selectItemByIid(iid);
    }

    @Override
    public Boolean createitem(Item item){
        return itemMapper.insertItem(item.getIid(),item.getGoodsName(),item.getContent(),item.getImgList(),item.getOrgprice(),item.getNewprice(),item.getClassify(),item.getNewold());
    }

}
