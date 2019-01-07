package com.zcy.invest.service;

import com.zcy.invest.model.iq.response.CandleGeneratedResponse;
import com.zcy.invest.model.iq.response.CandlesResponse;
import com.zcy.invest.model.iq.response.TimeSyncResponse;

/**
 * 处理消息
 * create date : 2019/1/6
 */
public interface DealMessageService {

    /**
     * 处理实时蜡烛图消息
     * @param candleGeneratedResponse
     */
    void dealCandleGenerated(CandleGeneratedResponse candleGeneratedResponse);

    /**
     * 处理服务器时间戳（毫秒）
     * @param response
     */
    void dealTimeSync(TimeSyncResponse response);

    /**
     * 处理蜡烛图集合
     * @param candlesResponse
     */
    void dealCandles(CandlesResponse candlesResponse);

}
