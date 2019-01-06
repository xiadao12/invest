package com.zcy.invest.service.impl;

import com.zcy.invest.model.iq.response.CandleGeneratedResponse;
import com.zcy.invest.service.DealMessageService;
import org.springframework.stereotype.Service;

/**
 * create date : 2019/1/6
 */
@Service
public class DealMessageServiceImpl implements DealMessageService {

    //记录上一个蜡烛信息
    private static CandleGeneratedResponse preCandleGeneratedResponse;

    /**
     * 处理蜡烛图消息
     * @param candleGeneratedResponse
     */
    @Override
    public void dealCandleGenerated(CandleGeneratedResponse candleGeneratedResponse) {

        //判断参数
        if(candleGeneratedResponse == null){
            return;
        }

        //如果是第一次赋值
        if(preCandleGeneratedResponse == null){
            preCandleGeneratedResponse = candleGeneratedResponse;
            return;
        }

        //上一个蜡烛图msg信息
        CandleGeneratedResponse.Msg preMsg = preCandleGeneratedResponse.getMsg();
        //当前蜡烛图msg信息
        CandleGeneratedResponse.Msg msg = candleGeneratedResponse.getMsg();
        //如果from相同，则说明还在一个蜡烛图中。不相同则说明进入到了下一个蜡烛图
        if(!preMsg.getFrom().equals(msg.getFrom())){
            System.out.println("时间：" + preMsg.getFrom());
            System.out.println("本地：" + System.currentTimeMillis());
            System.out.println("实体：" + preMsg.getOpen() + "  " + preMsg.getClose());
            System.out.println("影线：" + preMsg.getMin() + "  " + preMsg.getMax());
        }
        //将最新的蜡烛图赋值
        preCandleGeneratedResponse = candleGeneratedResponse;
    }
}
