package com.hjx.passbook.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建商户响应对象
 * @Author: hjx
 * @Date: 2019/3/20 23:13
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateMerchantsResponse {

    /** 商户 id: 创建失败为 -1*/
    private Integer id;

}
