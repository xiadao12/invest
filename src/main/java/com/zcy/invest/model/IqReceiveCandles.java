package com.zcy.invest.model;

/**
 * @version 1.0.0
 * @brief ecs insight
 * @note 修订历史： 1、yangzhouchuan于2018/12/21设计并构建初始版本v1.0.0
 */
public class IqReceiveCandles extends IqBaseRequest{

    Msg msg;

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }

    /**
     * 内部类
     */
    public static class Msg{
        private String name;
        private String version;
        //内部类
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
    public static class Body{
        private Long active_id;
        private Long size;
        private Long from_id;
        private Long to_id;
        private Boolean only_closed;

        public Long getActive_id() {
            return active_id;
        }

        public void setActive_id(Long active_id) {
            this.active_id = active_id;
        }

        public Long getSize() {
            return size;
        }

        public void setSize(Long size) {
            this.size = size;
        }

        public Long getFrom_id() {
            return from_id;
        }

        public void setFrom_id(Long from_id) {
            this.from_id = from_id;
        }

        public Long getTo_id() {
            return to_id;
        }

        public void setTo_id(Long to_id) {
            this.to_id = to_id;
        }

        public Boolean getOnly_closed() {
            return only_closed;
        }

        public void setOnly_closed(Boolean only_closed) {
            this.only_closed = only_closed;
        }
    }

}
