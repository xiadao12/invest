/*
package com.zcy.invest.temp;

import com.zcy.invest.core.IqWebSocketClient;
import com.zcy.invest.model.iq.request.IqSendChatHeartbeat;
import com.zcy.invest.util.JsonUtil;
import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;

*/
/**
 * @version 1.0.0
 * @brief ecs insight
 * @note 修订历史： 1、yangzhouchuan于2018/12/17设计并构建初始版本v1.0.0
 *//*

@Component
public class Test {

    //请求的id
    private static Long request_id = 1L;

    //websocket连接
    private static WebSocketClient webSocketClient;

    static {
*/
/*        try {
            webSocketClient = new IqWebSocketClient("wss://iqoption.com/echo/websocket");
            webSocketClient.connect();
            while (!webSocketClient.getReadyState().equals(WebSocket.READYSTATE.OPEN)) {
                System.out.println("还没有打开");
            }

            *//*
*/
/*{"name":"ssid","request_id":"1546751287_1049553889","msg":"a87f0428c732dbb972c114dfd5ed6981"}*//*
*/
/*
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }*//*

    }

    */
/**
     * 判断是否已连接
     *
     * @throws Exception
     *//*

    //@Scheduled(cron = "* * * * * ?")
    public void judgeConnect() throws Exception {
        //如果为空则赋值
        if (webSocketClient == null) {
            //webSocketClient = new IqWebSocketClient("wss://iqoption.com/echo/websocket");
        }

        //如果连接未打开，则进行连接
        if (!webSocketClient.getReadyState().equals(WebSocket.READYSTATE.OPEN)) {
            //如果没有连接，则赋值false
            //只有在关闭状态下再连接
            if (webSocketClient.getReadyState().equals(WebSocket.READYSTATE.CLOSED)) {
                webSocketClient.connect();
            }
        } else {
            //连接后赋值true
        }
    }

    //@Scheduled(cron = "0/10 * * * * ? ")
    public void ten() throws Exception {
        System.out.println("每10秒");

        Long currentTime = System.currentTimeMillis();
        IqHeartbeat iqHeartbeat = new IqHeartbeat("heartbeat", String.valueOf(request_id), currentTime.toString(), currentTime.toString());
        String iqHeartbeatJson = JsonUtil.ObjectToJson(iqHeartbeat);
        System.out.println(iqHeartbeatJson);
        webSocketClient.send(iqHeartbeatJson);

        request_id++;
    }

    //@Scheduled(cron = "0/30 * * * * ? ")
    public void thirty() throws Exception {
        System.out.println("每30秒");
        //发消息 send-chat-heartbeat
        IqSendChatHeartbeat iqSendChatHeartbeat = new IqSendChatHeartbeat("sendMessage", request_id.toString(), "send-chat-heartbeat", "1.0", "");
        String iqSendChatHeartbeatJson = JsonUtil.ObjectToJson(iqSendChatHeartbeat);
        System.out.println(iqSendChatHeartbeatJson);
        webSocketClient.send(iqSendChatHeartbeatJson);
        //发消息
        request_id++;
    }

    //@Scheduled(cron = "0 * * * * ?")
    public void sixth() throws Exception {
        System.out.println("每60秒");

        request_id++;
    }

    public static void main(String[] args) throws Exception {

        //WebSocketClient webSocketClient = new IqWebSocketClient("wss://iqoption.com/echo/websocket");
        webSocketClient.connect();

*/
/*        IqOptionServiceImpl iqOptionService = new IqOptionServiceImpl();
        String ss = iqOptionService.login(SecretContent.Email_QQ_851883560,SecretContent.Common_Password);
        System.out.println(ss);*//*


*/
/*        WebSocket ws = new WebSocket('wss://iqoption.com/echo/websocket', {
                "origin":'https://iqoption.com/traderoom/',
  });*//*


*/
/*        WebSocketClient webSocketClient = new MyWebSocketClient("wss://iqoption.com/echo/websocket");
        webSocketClient.connect();
        while (!webSocketClient.getReadyState().equals(WebSocket.READYSTATE.OPEN)) {
            System.out.println("还没有打开");
        }
        System.out.println("建立websocket连接");*//*


*/
/*        IqReceiveCandles.Body body = new IqReceiveCandles.Body();
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
        webSocketClient.send(value);*//*



*/
/*        int num = 1;

        while (true) {
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

            num++;
        }*//*


    }
}
*/
