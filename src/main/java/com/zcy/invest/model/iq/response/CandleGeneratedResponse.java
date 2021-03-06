package com.zcy.invest.model.iq.response;

/**
 * 实时蜡烛图
 *
 * create date : 2019/1/6
 */
public class CandleGeneratedResponse extends IqResponse {

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
    public class Msg {
        private Integer active_id;
        private Integer size;
        private Long at;
        private Long from;
        private Long to;
        private Long min_at;
        private Long max_at;
        private Integer id;
        private Double open;
        private Double close;
        private Double min;
        private Double max;
        private Double ask;
        private Double bid;
        private Integer volume;
        private String phase;

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

        public Long getAt() {
            return at;
        }

        public void setAt(Long at) {
            this.at = at;
        }

        public Long getFrom() {
            return from;
        }

        public void setFrom(Long from) {
            this.from = from;
        }

        public Long getTo() {
            return to;
        }

        public void setTo(Long to) {
            this.to = to;
        }

        public Long getMin_at() {
            return min_at;
        }

        public void setMin_at(Long min_at) {
            this.min_at = min_at;
        }

        public Long getMax_at() {
            return max_at;
        }

        public void setMax_at(Long max_at) {
            this.max_at = max_at;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getOpen() {
            return open;
        }

        public void setOpen(Double open) {
            this.open = open;
        }

        public Double getClose() {
            return close;
        }

        public void setClose(Double close) {
            this.close = close;
        }

        public Double getMin() {
            return min;
        }

        public void setMin(Double min) {
            this.min = min;
        }

        public Double getMax() {
            return max;
        }

        public void setMax(Double max) {
            this.max = max;
        }

        public Double getAsk() {
            return ask;
        }

        public void setAsk(Double ask) {
            this.ask = ask;
        }

        public Double getBid() {
            return bid;
        }

        public void setBid(Double bid) {
            this.bid = bid;
        }

        public Integer getVolume() {
            return volume;
        }

        public void setVolume(Integer volume) {
            this.volume = volume;
        }

        public String getPhase() {
            return phase;
        }

        public void setPhase(String phase) {
            this.phase = phase;
        }
    }

}
