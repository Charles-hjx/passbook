package com.hjx.passbook.VO;

import com.hjx.passbook.constant.ErrorCode;
import com.hjx.passbook.entity.Merchants;
import com.hjx.passbook.repository.MerchantsRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 商户投放的优惠券
 * @Author: hjx
 * @Date: 2019/3/19 22:48
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {
    /** 商户id*/
    private Integer id;
    private String title;
    /** 优惠券 摘要*/
    private String summary;
    /** 详细信息*/
    private String desc;
    /** 忧患券是否有Token 用户商户核销*/
    Boolean hasToken;
    /** 优惠券背景颜色*/
    private Integer background;
    /** 优惠券开始时间*/
    private Date start;
    /** 优惠券结束时间*/
    private Date end;

    /**
     * 校验优惠券对象的有效性
     * @return
     */
    public ErrorCode validate(MerchantsRepository merchantsRepository){
        if (null == merchantsRepository.findById(this.id)) {
            return ErrorCode.MERCHANTS_NOT_EXIST;
        }
        return ErrorCode.SUCCESS;
    }



}




