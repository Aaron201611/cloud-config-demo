package com.example.shopinfoservice.controller;

import com.example.dto.Shop;
import com.example.shopserviceapi.IShopService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecfactorShopController implements IShopService {

    @Override
    public String shopinfo() {
        return "Recfactor shopinfo";
    }

    @Override
    public Shop getShopInfo(String id, String name, Integer years) {
        Shop shop = new Shop(id, name,years);
        return shop;
    }

    @Override
    public String postShopInfo(Shop shop) {
        StringBuffer s = new StringBuffer("id:").append(shop.getId()).append(",name:").append(shop.getName()).append(",years:").append(shop.getYears());
        return s.toString();
    }
}
