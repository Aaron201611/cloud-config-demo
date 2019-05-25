package cloud.example.cloudzuul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulDealController {

    @Autowired
    private Environment env;

    @Autowired
    private ZuulProperties zuul;

    @RequestMapping(value = "/url",method = RequestMethod.GET)
    public String service(){

        return zuul.getRoutes().get("api-happyday").getPath();
    }
}
