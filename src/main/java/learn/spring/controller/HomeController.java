package learn.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 7/11/2016.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
       return "Das boot, reporting for duty!";
    }
}
