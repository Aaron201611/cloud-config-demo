package cloud.example.feign.shopfeignservice.controller;

import cloud.example.feign.shopfeignservice.model.Shop;
import cloud.example.feign.shopfeignservice.service.IShopInfoService;
import cloud.example.feign.shopfeignservice.service.RefactorShopService;
import com.example.shopserviceapi.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

//@RestController
public class ShopFeignController {

    @Autowired
    private IShopInfoService shopInfoService;



    @RequestMapping(value = "shop",method = RequestMethod.GET)
    public String shop(){
        return shopInfoService.shopinfo();
    }

    @RequestMapping(value = "shop2",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String shop2() throws Exception {
        StringBuffer s = new StringBuffer();
        String ss = new String("小张".getBytes("utf-8"),"utf-8");
//        s.append(shopInfoService.getShopInfo("123", URLEncoder.encode(ss,"utf-8"),100)).append("\n");
        s.append(shopInfoService.getShopInfo("123", ss,100)).append("\n");
        s.append(shopInfoService.postShopInfo(new Shop("234","信息",99)));

        return s.toString();
    }

    @RequestMapping(value = "shop3",method = RequestMethod.GET)
    public  String shop3(){
        Shop shop = new Shop("123","小王",98);
        String s = shopInfoService.postShopInfo(shop);
        return s;
    }



}
