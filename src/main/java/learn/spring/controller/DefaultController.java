package learn.spring.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConditionalOnMissingBean(HomeController.class)
public class DefaultController {
    @RequestMapping("/default")
    public String home(){
        return "Default Controller";
    }
}
