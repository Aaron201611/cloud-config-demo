package cloud.example.feign.shopfeignservice.controller;

import cloud.example.feign.shopfeignservice.service.RefactorShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorShopController {
    @Autowired
    private RefactorShopService refactorShopService;

    @RequestMapping(value = "shop4",method = RequestMethod.GET)
    public String shop4() throws Exception {
        StringBuffer s = new StringBuffer();
        String ss = new String("小张".getBytes("utf-8"),"utf-8");
//        s.append(shopInfoService.getShopInfo("123", URLEncoder.encode(ss,"utf-8"),100)).append("\n");
        s.append(refactorShopService.getShopInfo("123", ss,100)).append("\n");
        s.append(refactorShopService.postShopInfo(new com.example.dto.Shop("234","信息",99)));
        return s.toString();
    }

    @RequestMapping(value = "shop5",method = RequestMethod.GET)
    public  String shop5(){
        com.example.dto.Shop shop = new com.example.dto.Shop("123","小王",98);
        String s = refactorShopService.postShopInfo(shop);
        return s;
    }
}
