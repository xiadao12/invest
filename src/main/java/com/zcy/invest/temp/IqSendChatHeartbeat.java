/*
package com.zcy.invest.model.iq.request;

*/
/**
 * create date : 2019/1/4
 *//*

public class IqSendChatHeartbeat extends IqRequest {

    */
/**
     * 默认构造方法
     *//*

    public IqSendChatHeartbeat(){}

    */
/**
     * 构造方法
     * @param name
     * @param request_id
     * @param msg_name
     * @param msg_version
     * @param msg_body_room_id
     *//*

    public IqSendChatHeartbeat(String name,
                               String request_id,
                               String msg_name,
                               String msg_version,
                               String msg_body_room_id) {

        Body body = new Body();
        body.setRoom_id(msg_body_room_id);

        Msg msg = new Msg();
        msg.setName(msg_name);
        msg.setVersion(msg_version);
        msg.setBody(body);

        setName(name);
        setRequest_id(request_id);
        setMsg(msg);

    }

    private Msg msg;

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }

    */
/**
     * 内部类
     *//*

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

    */
/**
     * 内部类
     *//*

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
*/
