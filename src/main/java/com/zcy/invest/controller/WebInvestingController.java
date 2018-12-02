package com.zcy.invest.controller;

import com.zcy.invest.filter.WebInvestingFilter;
import com.zcy.invest.service.WebInvestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 查询 https://www.investing.com/
 * create date : 2018/12/1
 */
@RestController
@RequestMapping("/webinvesting")
public class WebInvestingController {

    @Autowired
    WebInvestingService webInvestingService;

    /**
     * 查询外汇
     * @param webInvestingFilter
     * @return
     */
    @PostMapping("/queryfx")
    public Object queryFx(WebInvestingFilter webInvestingFilter) throws Exception{
        return webInvestingService.queryFx(webInvestingFilter);
    }

}
