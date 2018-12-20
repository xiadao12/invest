package com.zcy.invest.temp;

import com.zcy.invest.core.SecretContent;
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
        String value =
                "{\"name\":\"heartbeat\",\"request_id\":\"1442\",\"msg\":{\"userTime\":\"1545309945923\",\"heartbeatTime\":\"1545309945866\"}}";
        webSocketClient.send(value);
    }
}
