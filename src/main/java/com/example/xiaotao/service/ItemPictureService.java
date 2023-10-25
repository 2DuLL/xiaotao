package com.example.xiaotao.service;

import java.util.List;

public interface ItemPictureService {
    public List<String> SelectPictureByItem(Integer iid);
    public Boolean insertPicture(Integer iid,String imgurl);
}
