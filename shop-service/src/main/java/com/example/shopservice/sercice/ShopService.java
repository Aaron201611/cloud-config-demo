package com.example.shopservice.sercice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShopService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hellofallback")
    public String shopinfo(){
        return restTemplate.getForEntity("http://shopinfo-service/shopinfo",String.class).getBody();
    }

    public String hellofallback(){
        return "hello error";
    }
}
