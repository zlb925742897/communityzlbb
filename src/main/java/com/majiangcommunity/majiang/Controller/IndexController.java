package com.majiangcommunity.majiang.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhanglibai
 * @create 2019-11-15-9:50
 **/
@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }
}
