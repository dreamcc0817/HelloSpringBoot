package com.dreamcc.demo.dao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: Demo
 * @Package: com.dreamcc.demo.dao
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/7/19 18:13
 * @Version: V1.0
 */
//@Controller
//@RequestMapping
public class HelloController {
   // @ResponseBody
   // @RequestMapping("hello")
    public String hello(){
        return "Hello";
    }
}
