package com.straw.slave.controller;

import com.straw.slave.model.Yesoulchenyu;
import com.straw.slave.service.YesoulChenYuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chenyu")
public class YesoulChenYuController {

    @Autowired
    YesoulChenYuService yesoulChenYuService;

    @RequestMapping("/everyDay")
    public String everyDay() {
        Yesoulchenyu yesoulChenYu = yesoulChenYuService.selectById("00053ee2-0e23-4b6c-92d8-26e3b3673ceb");
        return "11";
    }
}