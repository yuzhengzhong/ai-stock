package com.yzz.aistock.northbound;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiStockNorthbound {

    @RequestMapping("/testprint")
    public String testPrint() {

        System.out.println("hahaha...........");
        return "hello world...";
    }
}
