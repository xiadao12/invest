package com.zcy.invest.model.iq.request;

/**
 * @version 1.0.0
 * @brief ecs insight
 * @note 修订历史： 1、yangzhouchuan于2018/12/21设计并构建初始版本v1.0.0
 */
public class IqRequest<T> {
    //名称
    private String name;
    //请求id
    private String request_id;
    //信息
    private T msg;

    /**
     * 默认构造方法
     */
    public IqRequest(){}

    public IqRequest(String name, String request_id, T msg){
        this.name = name;
        this.request_id = request_id;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}
