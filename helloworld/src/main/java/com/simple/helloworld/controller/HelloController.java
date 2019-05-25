package com.simple.helloworld.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {

    @Value("${from}")
    private String from;

    @Autowired
    private Environment env;

    @RequestMapping(value="showFrom",method = RequestMethod.GET)
    public String showFrom(){
        env.getProperty("from");
        return "from:"+this.from+" , "+env.getProperty("from");
    }

    @RequestMapping(value="hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
}
