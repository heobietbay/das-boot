package learn.spring.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 7/11/2016.
 */
@RestController
@Profile("prod")
public class HomeController {

    @RequestMapping("/")
    public String home(){
       return "Das boot, reporting for duty!";
    }
}
