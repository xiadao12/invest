package com.zcy.invest.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zcy.invest.model.iq.request.SsidRequest;
import com.zcy.invest.model.iq.response.CandleGeneratedResponse;
import com.zcy.invest.service.DealMessageService;
import com.zcy.invest.service.impl.IqServiceImpl;
import com.zcy.invest.util.JsonUtil;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 */
@Scope
@Component
public class IqWebSocketClient extends WebSocketClient {

    //用于标识请求是否已连接
    private static Boolean hasConnected = true;

    //websocket请求路径
    private final static String websocketUrl = "wss://iqoption.com/echo/websocket";

    //日志
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    DealMessageService dealMessageService;

    /**
     * 构造方法
     *
     * @throws URISyntaxException
     */
    public IqWebSocketClient() throws URISyntaxException {
        super(new URI(websocketUrl));
    }

    /**
     * 监听websocket连接
     *
     * @param serverHandshake
     */
    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        logger.info("iqwebsocket已连接");

        //获取请求id
        String ssid_request_id = IqServiceImpl.getRequestId();

        //发送ssid请求
        //{"name":"ssid","request_id":"1546751287_1049553889","msg":"a87f0428c732dbb972c114dfd5ed6981"}
        SsidRequest ssidRequest = new SsidRequest(
                ssid_request_id,
                "a87f0428c732dbb972c114dfd5ed6981"
        );
        String ssidRequestJson = null;
        ssidRequestJson = JsonUtil.ObjectToJson(ssidRequest);
        this.send(ssidRequestJson);
    }

    /**
     * 监听websocket接收消息
     *
     * @param s
     */
    @Override
    public void onMessage(String s) {
        logger.info("iqwebsocket接收到消息：" + s);

        //处理接收到的消息
        dealMessage(s);
    }

    /**
     * 监听websocket关闭
     *
     * @param i
     * @param s
     * @param b
     */
    @Override
    public void onClose(int i, String s, boolean b) {
        logger.info("iqwebsocket连接已关闭");
    }

    /**
     * 监听websocket出错
     *
     * @param e
     */
    @Override
    public void onError(Exception e) {
        logger.info("iqwebsocket出错error");
    }

    /**
     * 处理消息
     *
     * @param message
     */
    private void dealMessage(String message) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            //判断是什么信息
            //蜡烛图信息
            if (message.contains("candle-generated")) {
                CandleGeneratedResponse candleGeneratedResponse = objectMapper.readValue(message, CandleGeneratedResponse.class);
                dealMessageService.dealCandleGenerated(candleGeneratedResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}