package com.zcy.invest.model;

import java.util.Set;

/**
 * create date : 2018/12/2
 */
public class Fx {
    private Integer id;
    private String fxPre;
    private Set<String> platform;
    private Boolean main;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFxPre() {
        return fxPre;
    }

    public void setFxPre(String fxPre) {
        this.fxPre = fxPre;
    }

    public Set<String> getPlatform() {
        return platform;
    }

    public void setPlatform(Set<String> platform) {
        this.platform = platform;
    }

    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }
}
