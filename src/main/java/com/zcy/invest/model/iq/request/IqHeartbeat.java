package com.zcy.invest.model.iq.request;

/**
 * 心跳
 *
 * @version 1.0.0
 * @brief ecs insight
 * @note 修订历史： 1、yangzhouchuan于2018/12/21设计并构建初始版本v1.0.0
 */
public class IqHeartbeat extends IqBaseRequest {

    //内部类
    private Msg msg;

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }

    public static class Msg {

        private String userTime;
        private String heartbeatTime;

        public String getUserTime() {
            return userTime;
        }

        public void setUserTime(String userTime) {
            this.userTime = userTime;
        }

        public String getHeartbeatTime() {
            return heartbeatTime;
        }

        public void setHeartbeatTime(String heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
        }
    }

}
