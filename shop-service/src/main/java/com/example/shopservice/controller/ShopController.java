package com.example.shopservice.controller;

import com.example.shopservice.sercice.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "shop",method = RequestMethod.GET)
    public String shop(){
        return shopService.shopinfo();
    }

}
