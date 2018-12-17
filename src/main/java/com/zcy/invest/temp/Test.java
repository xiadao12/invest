package com.zcy.invest.temp;

import com.zcy.invest.core.SecretContent;
import com.zcy.invest.service.impl.IqOptionServiceImpl;

/**
 * @version 1.0.0
 * @brief ecs insight
 * @note 修订历史： 1、yangzhouchuan于2018/12/17设计并构建初始版本v1.0.0
 */
public class Test {
    public static void main(String[] args) throws Exception{

        IqOptionServiceImpl iqOptionService = new IqOptionServiceImpl();
        String ss = iqOptionService.login(SecretContent.IQOPTION_USERNAME,SecretContent.Common_Password);
        System.out.println(ss);
    }
}
