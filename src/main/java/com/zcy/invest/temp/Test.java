package com.zcy.invest.temp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zcy.invest.core.SecretContent;
import com.zcy.invest.model.IqHeartbeat;
import com.zcy.invest.model.IqReceiveCandles;
import com.zcy.invest.service.impl.IqOptionServiceImpl;
import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;

/**
 * @version 1.0.0
 * @brief ecs insight
 * @note 修订历史： 1、yangzhouchuan于2018/12/17设计并构建初始版本v1.0.0
 */
public class Test {
    public static void main(String[] args) throws Exception{

/*        IqOptionServiceImpl iqOptionService = new IqOptionServiceImpl();
        String ss = iqOptionService.login(SecretContent.Email_QQ_851883560,SecretContent.Common_Password);
        System.out.println(ss);*/

        WebSocketClient webSocketClient = new MyWebSocketClient("wss://iqoption.com/echo/websocket");
        webSocketClient.connect();
        while (!webSocketClient.getReadyState().equals(WebSocket.READYSTATE.OPEN)) {
            System.out.println("还没有打开");
        }
        System.out.println("建立websocket连接");

        IqReceiveCandles.Body body = new IqReceiveCandles.Body();
        body.setActive_id(4L);
        body.setSize(60L);
        body.setFrom_id(427750L);
        body.setTo_id(427949L);
        body.setOnly_closed(true);

        IqReceiveCandles.Msg msg = new IqReceiveCandles.Msg();
        msg.setName("get-candles");
        msg.setVersion("2.0");
        msg.setBody(body);

        IqReceiveCandles iqReceiveCandles = new IqReceiveCandles();
        iqReceiveCandles.setName("sendMessage");
        iqReceiveCandles.setRequest_id("1");
        iqReceiveCandles.setMsg(msg);

        ObjectMapper objectMapper = new ObjectMapper();
        String value = objectMapper.writeValueAsString(iqReceiveCandles);
        System.out.println(value);
        webSocketClient.send(value);

/*
        int num = 1;

        while (true){
            IqHeartbeat.Msg msg = new IqHeartbeat.Msg();

            Long currentTime = System.currentTimeMillis();
            System.out.println(currentTime);
            msg.setUserTime(currentTime.toString());
            msg.setHeartbeatTime(currentTime.toString());

            IqHeartbeat iqHeartbeat = new IqHeartbeat();
            iqHeartbeat.setName("heartbeat");
            iqHeartbeat.setRequest_id(String.valueOf(num));
            iqHeartbeat.setMsg(msg);

            ObjectMapper objectMapper = new ObjectMapper();
            String value = objectMapper.writeValueAsString(iqHeartbeat);
            System.out.println(value);
            webSocketClient.send(value);
            Thread.sleep(2000);


            num ++ ;
        }*/

    }
}
