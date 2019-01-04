package com.zcy.invest.model.iq.request;

/**
 * create date : 2019/1/4
 */
public class IqSendChatHeartbeat extends IqBaseRequest {

    private Msg msg;

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }

    /**
     * 内部类
     */
    public static class Msg {
        private String name;
        private String version;
        private Body body;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Body getBody() {
            return body;
        }

        public void setBody(Body body) {
            this.body = body;
        }
    }

    /**
     * 内部类
     */
    public static class Body {
        private String room_id;

        public String getRoom_id() {
            return room_id;
        }

        public void setRoom_id(String room_id) {
            this.room_id = room_id;
        }
    }
}
