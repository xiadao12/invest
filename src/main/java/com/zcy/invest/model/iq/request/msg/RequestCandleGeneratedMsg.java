package com.zcy.invest.model.iq.request.msg;

/**
 * create date : 2019/1/6
 */
public class RequestCandleGeneratedMsg {
    //"msg":{"name":"candle-generated","params":{"routingFilters":{"active_id":76,"size":1}}
    private String name;
    private Params params;

    /**
     * 默认构造方法
     */
    public RequestCandleGeneratedMsg(){}

    /**
     * 构造方法
     * @param name
     * @param params_routingFilters_active_id
     * @param params_routingFilters_size
     */
    public RequestCandleGeneratedMsg(String name,
                                     Integer params_routingFilters_active_id,
                                     Integer params_routingFilters_size){

        RoutingFilters routingFilters = new RoutingFilters();
        routingFilters.setActive_id(params_routingFilters_active_id);
        routingFilters.setSize(params_routingFilters_size);

        Params params = new Params();
        params.setRoutingFilters(routingFilters);

        setName(name);
        setParams(params);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    /**
     * 内部类
     */
    private class Params {
        RoutingFilters routingFilters;

        public RoutingFilters getRoutingFilters() {
            return routingFilters;
        }

        public void setRoutingFilters(RoutingFilters routingFilters) {
            this.routingFilters = routingFilters;
        }
    }

    /**
     * 内部类
     */
    private class RoutingFilters {
        private Integer active_id;
        private Integer size;

        public Integer getActive_id() {
            return active_id;
        }

        public void setActive_id(Integer active_id) {
            this.active_id = active_id;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }
    }
}
