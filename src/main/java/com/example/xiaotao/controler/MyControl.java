package com.example.xiaotao.controler;


import com.example.xiaotao.entity.Item;
import com.example.xiaotao.service.ItemPictureService;
import com.example.xiaotao.service.ItemServiceImpl;
import com.example.xiaotao.service.UserFavouriteService;
import com.example.xiaotao.service.UserItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@Controller
public class MyControl {

    @Autowired
    UserItemServiceImpl userItemService;


    @RequestMapping("/myitem/{uid}")
    @ResponseBody
    public List<Item> queryMyItem(@PathVariable("uid") Integer uid){
        List<Item> items = userItemService.selectItemByUid(uid);
        return  items;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String helloworld(){
        return "hello";
    }

    @Autowired
    ItemServiceImpl itemService;


    @RequestMapping("/item/{iid}")
    @ResponseBody
    public Item detailItem(@PathVariable("iid") Integer iid){
        Item item = itemService.selectItemByIid(iid);
        return item;
    }
    @RequestMapping(value = "/createitem", method = RequestMethod.POST)
    @ResponseBody
    public String createitem(@RequestParam(value = "userid",required = false)Integer userid,@RequestParam(value = "goodsName",required = false)String goodsName,@RequestParam(value = "content",required = false)String content,@RequestParam(value = "imgList",required = false)String imgList,@RequestParam(value = "orgprice",required = false)Double orgprice,@RequestParam(value = "newprice",required = false)Double newprice,@RequestParam(value = "classify",required = false)String classify,@RequestParam(value = "newold",required = false)String newold) {

        Random rd = new Random();
        Integer iid = rd.nextInt();
        while(itemService.selectItemByIid(iid)==null){
            iid = rd.nextInt();
        }
        Item item = new Item(iid,goodsName,content,imgList,orgprice,newprice,classify,newold);
        if(itemService.createitem(item)&&userItemService.insertRecord(userid,iid)){
            return "创建成功";
        }else{
            return "创建失败";
        }
    }

    @Autowired
    UserFavouriteService userFavouriteService;


    @RequestMapping("/favourite/{uid}")
    @ResponseBody
    public List<Item> favouriteItem(@PathVariable("uid") Integer uid){
        return  userFavouriteService.selectUserFavouriteItem(uid);
    }

    @Autowired
    ItemPictureService itemPictureService;

    @RequestMapping("/picture/{iid}")
    @ResponseBody
    public List<String> itemPicture(@PathVariable("iid") Integer iid){
        return itemPictureService.SelectPictureByItem(iid);
    }

}
