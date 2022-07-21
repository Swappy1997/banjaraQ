package com.banjaravivahapis.banjaravivahspringapis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class TestController {

    @RequestMapping("/test")
    public String  firstHandler(){
        return"Hello ";
    }


    @RequestMapping("/hello")
    public String  test2(){
        return"Hello world ";
    }
}
