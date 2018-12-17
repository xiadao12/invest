package com.zcy.invest.model;

/**
 * IqOption登录返回对象
 * {
 *   "data": {
 *     "ssid": "e94c06fbeff03c7e079a837c70780beb"
 *   }
 * }
 *
 * @version 1.0.0
 * @brief ecs insight
 * @note 修订历史： 1、yangzhouchuan于2018/12/17设计并构建初始版本v1.0.0
 */
public class IqOptionLoginResponse {

    //内部类
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    /**
     * 静态内部类
     */
    public static class Data{
        //ssid
        private String ssid;

        public String getSsid() {
            return ssid;
        }

        public void setSsid(String ssid) {
            this.ssid = ssid;
        }
    }

}
