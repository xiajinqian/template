package com.blue.modules.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/26.
 */
@RestController
@RequestMapping("/rest")
public class DemoController {

    @RequestMapping("/index")
    public String index(){
        return "123";
    }
}
