package com.zcy.invest.service;

import com.zcy.invest.filter.WebInvestingFilter;

/**
 * create date : 2018/12/1
 */
public interface WebInvestingService {
    /**
     * 查询外汇
     *
     * @param webInvestingFilter
     * @return
     */
    String queryFx(WebInvestingFilter webInvestingFilter) throws Exception;
}
