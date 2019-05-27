package com.example.shopinfoservice.controller;

import com.example.dto.Shop;
import com.example.shopserviceapi.IShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecfactorShopController implements IShopService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public String shopinfo() {
        return "Recfactor shopinfo";
    }

    @Override
    public Shop getShopInfo(String id, String name, Integer years) {
        logger.info("======call getShopInfo======");
        Shop shop = new Shop(id, name,years);
        return shop;
    }

    @Override
    public String postShopInfo(Shop shop) {
        logger.info("======call postShopInfo======");
        StringBuffer s = new StringBuffer("id:").append(shop.getId()).append(",name:").append(shop.getName()).append(",years:").append(shop.getYears());
        return s.toString();
    }
}
