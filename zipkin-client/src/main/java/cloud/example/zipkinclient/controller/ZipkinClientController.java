package cloud.example.zipkinclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipkinClientController {

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
