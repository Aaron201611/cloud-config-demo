package cloud.example.feign.shopfeignservice.service;

import cloud.example.feign.shopfeignservice.model.Shop;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

//@FeignClient("shopinfo-service")
public interface IShopInfoService {

    @RequestMapping("/shopinfo")
    String shopinfo();

    @RequestMapping(value = "/shopinfo2",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Shop getShopInfo(@RequestHeader("id")String id, @RequestHeader("name")String name, @RequestHeader("years")Integer years);

    @RequestMapping(value = "/shopinfo3",method = RequestMethod.POST)
    String postShopInfo(@RequestBody Shop shop);
}
