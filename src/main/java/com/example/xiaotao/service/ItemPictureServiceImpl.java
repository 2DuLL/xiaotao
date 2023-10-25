package com.example.xiaotao.service;


import com.example.xiaotao.mapper.ItemPictureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPictureServiceImpl implements ItemPictureService{
    @Autowired
    ItemPictureMapper itemPictureMapper;

    @Override
    public List<String> SelectPictureByItem(Integer iid) {

        return itemPictureMapper.selectPictureByItem(iid);
    }
    @Override
    public Boolean insertPicture(Integer iid,String imgurl){
        return itemPictureMapper.insertItemPicture(iid,imgurl);
    }
}
