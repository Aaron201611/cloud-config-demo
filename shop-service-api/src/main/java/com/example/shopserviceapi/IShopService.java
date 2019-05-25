package com.example.shopserviceapi;

import com.example.dto.Shop;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/refactor")
public interface IShopService {

    @RequestMapping("/shopinfo4")
    String shopinfo();

    @RequestMapping(value = "/shopinfo5",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Shop getShopInfo(@RequestHeader("id")String id, @RequestHeader("name")String name, @RequestHeader("years")Integer years);

    @RequestMapping(value = "/shopinfo6",method = RequestMethod.POST)
    String postShopInfo(@RequestBody Shop shop);
}
