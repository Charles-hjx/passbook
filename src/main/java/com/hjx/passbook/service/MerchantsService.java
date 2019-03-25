package com.hjx.passbook.service;

import com.hjx.passbook.VO.CreateMerchantsRequest;
import com.hjx.passbook.VO.PassTemplate;
import com.hjx.passbook.VO.Response;

/**
 * 商户服务接口定义
 *
 * @Author: hjx
 * @Date: 2019/3/21 22:29
 * @Version 1.0
 */
public interface MerchantsService {
    /** 创建商户请求*/
    Response createMechants(CreateMerchantsRequest request);

    /**
     * 根据id构建商户信息
     * @param id
     * @return
     */
    Response buildMerchantsInfoById(Integer id);

    /**
     * 投放优惠券
     * @return
     */
    Response dropPassTemplate(PassTemplate passTemplate);
}
