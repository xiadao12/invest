package com.zcy.invest.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zcy.invest.model.iq.request.IqRequest;
import com.zcy.invest.model.iq.response.CandleGeneratedResponse;
import com.zcy.invest.service.impl.IqServiceImpl;
import com.zcy.invest.util.JsonUtil;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
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
        System.out.println("websocket__open");

        //获取请求id
        String ssid_request_id = IqServiceImpl.getRequestId();

        //发送ssid请求
        //{"name":"ssid","request_id":"1546751287_1049553889","msg":"a87f0428c732dbb972c114dfd5ed6981"}
        IqRequest ssidRequest = new IqRequest<String>(
                "ssid",
                ssid_request_id, "a87f0428c732dbb972c114dfd5ed6981"
        );
        String ssidRequestJson = null;
        ssidRequestJson = JsonUtil.ObjectToJson(ssidRequest);
        this.send(ssidRequestJson);
        /*
        send('setOptions', { sendResults: true }, () => {}, -1);
        send('ssid', user.ssid, funcs.open);
        */
    }

    /**
     * 监听websocket接收消息
     *
     * @param s
     */
    @Override
    public void onMessage(String s) {
        System.out.println("websocket__message" + s);

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
        System.out.println("websocket__close");
    }

    /**
     * 监听websocket出错
     *
     * @param e
     */
    @Override
    public void onError(Exception e) {
        System.out.println("websocket__error");
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
                System.out.println(candleGeneratedResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}