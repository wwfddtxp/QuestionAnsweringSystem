package com.ctsi.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wf156437@sina.com
 * @createTime 2019/11/4 18:39
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class Example {

    @RequestMapping("home")
    String home(){
        return "hello world!!!";
    }


}
