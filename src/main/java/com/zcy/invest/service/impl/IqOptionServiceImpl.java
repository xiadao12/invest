package com.zcy.invest.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zcy.invest.core.Constant;
import com.zcy.invest.core.HttpHeader;
import com.zcy.invest.model.iq.request.IqOptionLoginResponse;
import com.zcy.invest.service.IqOptionService;
import com.zcy.invest.util.HttpClientUtil;
import com.zcy.invest.util.StringUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0.0
 * @brief ecs insight
 * @note 修订历史： 1、yangzhouchuan于2018/12/17设计并构建初始版本v1.0.0
 */
@Service
public class IqOptionServiceImpl implements IqOptionService {

    /**
     * 根据email和密码登录iqoption，获取ssid
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public String login(String username, String password) throws Exception {

        //判断参数
        if (StringUtil.isEmpty(username) || StringUtil.isEmpty(password)) {
            throw new RuntimeException("iqoption的用户名或密码为空，无法登录获取ssid");
        }

        //返回结果
        String ssid = "";

        //设置头信息
        HttpHeader httpHeader = new HttpHeader();
        httpHeader.setContentType("application/x-www-form-urlencoded");
        //httpHeader.setAccept("*/*");
/*        httpHeader.setAcceptEncoding("gzip, deflate, br");
        httpHeader.setAcceptLanguage("zh-CN,zh;q=0.9");
        httpHeader.setConnection("keep-alive");
        httpHeader.setHost("auth.iqoption.com");
        httpHeader.setOrigin("https://iqoption.com");
        httpHeader.setReferer("https://iqoption.com/en");
        httpHeader.setUserAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36");*/

        //请求地址
        String url = Constant.WEB_IQOPTION_LOGIN;

        //设置参数
        Map<String, Object> params = new HashMap<>();
        params.put("email", username);
        params.put("password", password);
        //params.put("google_client_id", "1621745674.1545026677");

        String responseString = HttpClientUtil.doPost(url, params, httpHeader);

        //将String转为登录返回对象，获取ssid
        ObjectMapper objectMapper = new ObjectMapper();
        IqOptionLoginResponse iqOptionLoginResponse = objectMapper.readValue(responseString, new TypeReference<IqOptionLoginResponse>() {
        });
        if (iqOptionLoginResponse != null) {
            IqOptionLoginResponse.Data data = iqOptionLoginResponse.getData();
            if (data != null) {
                ssid = data.getSsid();
            }
        }
        return ssid;
    }
}
