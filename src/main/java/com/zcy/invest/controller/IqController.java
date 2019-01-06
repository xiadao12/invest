package com.zcy.invest.controller;

import com.zcy.invest.core.BtResult;
import com.zcy.invest.core.IqWebSocketClient;
import com.zcy.invest.model.iq.request.IqRequest;
import com.zcy.invest.model.iq.request.msg.RequestCandleGeneratedMsg;
import com.zcy.invest.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create date : 2019/1/6
 */
@RestController
@RequestMapping("/iq")
public class IqController {

    @Autowired
    IqWebSocketClient iqWebSocketClient;

    /**
     * 打开连接
     */
    @GetMapping("/openConnect")
    public BtResult<?> openConnect() throws Exception {
        //IqWebSocketClient iqWebSocketClient = IqWebSocketClient.getIqWebSocketClient();
        iqWebSocketClient.connect();
        return BtResult.OK("执行成功");
    }

    /**
     * 获取蜡烛图
     *
     * @return
     * @throws Exception
     */
    @GetMapping("/getCandleGenerated")
    public BtResult getCandleGenerated() throws Exception {
        //蜡烛图请求
        RequestCandleGeneratedMsg requestCandleGeneratedMsg = new RequestCandleGeneratedMsg(
                "candle-generated",
                76,
                60
        );
        IqRequest candleGeneratedRequest = new IqRequest<RequestCandleGeneratedMsg>(
                "subscribeMessage",
                "s_71",
                requestCandleGeneratedMsg
        );
        String candleGeneratedRequestJson = JsonUtil.ObjectToJson(candleGeneratedRequest);
        iqWebSocketClient.send(candleGeneratedRequestJson);
        return BtResult.OK("执行成功");
    }

}
