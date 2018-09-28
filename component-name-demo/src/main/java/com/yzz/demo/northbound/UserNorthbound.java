package com.yzz.demo.northbound;

import com.yzz.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class UserNorthbound {

    @Autowired
    private UserService userService;

    @RequestMapping("/testprint")
    public String testPrint() {

        System.out.println("hahaha...........");

        userService.testPrint();

        return "hello world...";
    }
}
