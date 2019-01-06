package com.zcy.invest.service;

import com.zcy.invest.model.iq.response.CandleGeneratedResponse;

/**
 * 处理消息
 * create date : 2019/1/6
 */
public interface DealMessageService {

    /**
     * 处理蜡烛图消息
     * @param candleGeneratedResponse
     */
    void dealCandleGenerated(CandleGeneratedResponse candleGeneratedResponse);

}
