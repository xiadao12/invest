package com.zcy.invest.temp;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

/**
 * @author 苏州中科蓝迪公司所有(c)2016-2021
 * @version 1.0.0
 * @brief ecs insight
 * @note 修订历史： 1、yangzhouchuan于2018/12/17设计并构建初始版本v1.0.0
 */
public class MyWebSocketClient extends WebSocketClient {

    public MyWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("websocket__open");
    }

    @Override
    public void onMessage(String s) {
        System.out.println("websocket__message" + s);
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        System.out.println("websocket__close");
    }

    @Override
    public void onError(Exception e) {
        System.out.println("websocket__error");
    }
}