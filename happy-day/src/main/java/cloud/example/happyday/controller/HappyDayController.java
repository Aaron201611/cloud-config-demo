package cloud.example.happyday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HappyDayController {

    @Value("${from}")
    private String from;

    @Autowired
    private Environment env;

    @RequestMapping(value = "/happy",method = RequestMethod.GET)
    public String happy(){

        return "happy day!";
    }

    @RequestMapping(value = "/from",method = RequestMethod.GET)
    public String from(){
        env.getProperty("from");
        return "from:"+this.from+env.getProperty("from");
    }

}
