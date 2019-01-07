package com.zcy.invest.controller;

import com.zcy.invest.core.BtResult;
import com.zcy.invest.core.IqWebSocketClient;
import com.zcy.invest.model.iq.request.CandleGeneratedRequest;
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
        CandleGeneratedRequest candleGeneratedRequest = new CandleGeneratedRequest(
                "s_71",
                4,
                60);

        String candleGeneratedRequestJson = JsonUtil.ObjectToJson(candleGeneratedRequest);
        iqWebSocketClient.send(candleGeneratedRequestJson);
        return BtResult.OK("执行成功");
    }

}
