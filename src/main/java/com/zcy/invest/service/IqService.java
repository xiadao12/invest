package com.zcy.invest.service;

/**
 * @version 1.0.0
 * @brief ecs insight
 * @note 修订历史： 1、yangzhouchuan于2018/12/17设计并构建初始版本v1.0.0
 */
public interface IqService {

    /**
     * 根据email和密码登录iqoption，获取ssid
     *
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password) throws Exception;

}
