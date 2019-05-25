package com.example.shopinfoservice.controller;

import com.example.shopinfoservice.model.Shop;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RestController
public class ShopinfoController {

    @RequestMapping(value = "shopinfo",method = RequestMethod.GET)
    public String shopinfo(){
        return "good shopinfo";
    }

    @RequestMapping(value="shopinfo2",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Shop getShopInfo(@RequestHeader String id,@RequestHeader String name,@RequestHeader Integer years) throws Exception {
//        Shop shop = new Shop(id, URLDecoder.decode(name,"utf-8"),years);
        Shop shop = new Shop(id, name,years);
        return shop;
    }

    @RequestMapping(value="shopinfo3",method = RequestMethod.POST)
    public String postShopInfo(@RequestBody Shop shop){
        StringBuffer s = new StringBuffer("id:").append(shop.getId()).append(",name:").append(shop.getName()).append(",years:").append(shop.getYears());
        return s.toString();
    }
}
