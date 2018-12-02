package com.zcy.invest.service.impl;

import com.zcy.invest.core.Constant;
import com.zcy.invest.core.RepeatHttpParamList;
import com.zcy.invest.filter.WebInvestingFilter;
import com.zcy.invest.core.HttpHeader;
import com.zcy.invest.service.WebInvestingService;
import com.zcy.invest.util.HttpClientUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * create date : 2018/12/1
 */
@Service
public class WebInvestingServiceImpl implements WebInvestingService {

    /**
     * 查询外汇
     *
     * @param webInvestingFilter
     * @return
     */
    @Override
    public String queryFx(WebInvestingFilter webInvestingFilter) throws Exception{

        if(webInvestingFilter == null){
            return "";
        }

        //设置头信息
        HttpHeader httpHeader = new HttpHeader();
        httpHeader.setAccept("application/json, text/javascript, */*; q=0.01");
        httpHeader.setAcceptEncoding("gzip, deflate, br");
        httpHeader.setAcceptLanguage("zh-CN,zh;q=0.9");
        httpHeader.setConnection("keep-alive");
        httpHeader.setContentType("application/x-www-form-urlencoded");
        //httpHeader.setCookie("adBlockerNewUserDomains=1543326234; optimizelyEndUserId=oeu1543326265661r0.9204945099884461; _ga=GA1.2.1054072231.1543326294; __gads=ID=7568c6d6cf021490:T=1543326295:S=ALNI_MaA4X2B8C_-SHUSnn-2MaKRD2IilA; __qca=P0-411361095-1543326295143; editionPostpone=1543326301226; r_p_s_n=1; _gid=GA1.2.1400025690.1543502695; PHPSESSID=uh9t2b60gaa86ucp1l7e217m60; gtmFired=OK; StickySession=id.36699778939.635.www.investing.com; SideBlockUser=a%3A2%3A%7Bs%3A10%3A%22stack_size%22%3Ba%3A1%3A%7Bs%3A11%3A%22last_quotes%22%3Bi%3A8%3B%7Ds%3A6%3A%22stacks%22%3Ba%3A1%3A%7Bs%3A11%3A%22last_quotes%22%3Ba%3A5%3A%7Bi%3A0%3Ba%3A3%3A%7Bs%3A7%3A%22pair_ID%22%3Bs%3A2%3A%2253%22%3Bs%3A10%3A%22pair_title%22%3Bs%3A31%3A%22British+Pound+Australian+Dollar%22%3Bs%3A9%3A%22pair_link%22%3Bs%3A19%3A%22%2Fcurrencies%2Fgbp-aud%22%3B%7Di%3A1%3Ba%3A3%3A%7Bs%3A7%3A%22pair_ID%22%3Bs%3A2%3A%2211%22%3Bs%3A10%3A%22pair_title%22%3Bs%3A26%3A%22British+Pound+Japanese+Yen%22%3Bs%3A9%3A%22pair_link%22%3Bs%3A19%3A%22%2Fcurrencies%2Fgbp-jpy%22%3B%7Di%3A2%3Ba%3A3%3A%7Bs%3A7%3A%22pair_ID%22%3Bs%3A1%3A%221%22%3Bs%3A10%3A%22pair_title%22%3Bs%3A14%3A%22Euro+US+Dollar%22%3Bs%3A9%3A%22pair_link%22%3Bs%3A19%3A%22%2Fcurrencies%2Feur-usd%22%3B%7Di%3A3%3Ba%3A3%3A%7Bs%3A7%3A%22pair_ID%22%3Bs%3A1%3A%222%22%3Bs%3A10%3A%22pair_title%22%3Bs%3A23%3A%22British+Pound+US+Dollar%22%3Bs%3A9%3A%22pair_link%22%3Bs%3A19%3A%22%2Fcurrencies%2Fgbp-usd%22%3B%7Di%3A4%3Ba%3A3%3A%7Bs%3A7%3A%22pair_ID%22%3Bs%3A1%3A%226%22%3Bs%3A10%3A%22pair_title%22%3Bs%3A18%3A%22Euro+British+Pound%22%3Bs%3A9%3A%22pair_link%22%3Bs%3A19%3A%22%2Fcurrencies%2Feur-gbp%22%3B%7D%7D%7D%7D; geoC=CN; billboardCounter_1=1; _gat_allSitesTracker=1; _gat=1");
        httpHeader.setHost("www.investing.com");
        httpHeader.setOrigin("https://www.investing.com");
        httpHeader.setReferer("https://www.investing.com/technical/technical-summary");
        httpHeader.setUserAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36");
        httpHeader.setxRequestedWith("XMLHttpRequest");

        //请求地址
        String url = Constant.WEB_INVESTING_QUERYFX;

        //设置参数
        //外汇集合
        RepeatHttpParamList fxList = new RepeatHttpParamList();

        for(int i=1;i<=150;i++){
            fxList.add(i);
        }

        //时间集合
        RepeatHttpParamList timeList = new RepeatHttpParamList();
        timeList.add(60);
        timeList.add(300);
        timeList.add(900);
        timeList.add(1800);
        timeList.add(3600);
        timeList.add(18000);
        timeList.add(86400);
        timeList.add("week");
        timeList.add("month");

        Map<String, Object> params = new HashMap<>();
        params.put("options[currencies][]", fxList);
        params.put("options[periods][]", timeList);
        params.put("tab", "forex");

        String ss = HttpClientUtil.doPost(url, params, httpHeader);

        System.out.println(ss);
        return null;
    }
}
