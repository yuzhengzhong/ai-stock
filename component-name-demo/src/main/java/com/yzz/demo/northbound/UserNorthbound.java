package com.yzz.demo.northbound;

import com.yzz.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class UserNorthbound {

    Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @RequestMapping("/testprint")
    public String testPrint() {

        System.out.println("hahaha...........");

        userService.testPrint();

        return "hello world...";
    }
}
