package com.zcy.invest.model.iq.request;

/**
 * create date : 2019/1/4
 */
public class IqUpdateUserAvailability extends IqBaseRequest {

    //内部类
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

    public static class Body {
        private String platform_id;
        private Integer idle_duration;
        private Integer selected_asset_id;
        private Integer selected_asset_type;

        public String getPlatform_id() {
            return platform_id;
        }

        public void setPlatform_id(String platform_id) {
            this.platform_id = platform_id;
        }

        public Integer getIdle_duration() {
            return idle_duration;
        }

        public void setIdle_duration(Integer idle_duration) {
            this.idle_duration = idle_duration;
        }

        public Integer getSelected_asset_id() {
            return selected_asset_id;
        }

        public void setSelected_asset_id(Integer selected_asset_id) {
            this.selected_asset_id = selected_asset_id;
        }

        public Integer getSelected_asset_type() {
            return selected_asset_type;
        }

        public void setSelected_asset_type(Integer selected_asset_type) {
            this.selected_asset_type = selected_asset_type;
        }
    }
}
