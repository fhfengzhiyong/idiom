package com.straw.slave.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chenyu")
public class YesoulChenYuController {

    @RequestMapping("/everyDay")
    public String everyDay(){
        return "11";
    }
}
