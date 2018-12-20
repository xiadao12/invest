package com.zcy.invest.temp;

import org.jsoup.Jsoup;

import java.util.HashMap;
import java.util.Map;

/**
 * create date : 2018/12/1
 */
public class Temp {
    public static void main(String[] args) throws Exception{

        Map<String, String> params = new HashMap<>();
        params.put("tab","forex");
        params.put("options[currencies][]","12");

        String ss = Jsoup.connect("https://www.investing.com/technical/Service/GetSummaryTable")
                .data(params)
                .header("X-Requested-With", "XMLHttpRequest")
                .post()
                .text();

        System.out.println(ss);
    }
}
