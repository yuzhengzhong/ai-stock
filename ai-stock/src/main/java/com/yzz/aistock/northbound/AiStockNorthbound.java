package com.yzz.aistock.northbound;

import com.yzz.aistock.service.AiStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aistock")
public class AiStockNorthbound {

    @Autowired
    private AiStockService aiStockService;

    @RequestMapping("/testprint")
    public String testPrint() {

        System.out.println("hahaha...........");

        aiStockService.testPrint();

        return "hello world...";
    }
}
