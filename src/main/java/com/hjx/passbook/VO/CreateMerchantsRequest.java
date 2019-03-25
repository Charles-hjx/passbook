package com.hjx.passbook.VO;

import com.hjx.passbook.constant.ErrorCode;
import com.hjx.passbook.entity.Merchants;
import com.hjx.passbook.repository.MerchantsRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: hjx
 * @Date: 2019/3/20 22:56
 * @Version 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateMerchantsRequest {

    /** 商户名称*/
    private String name;
    /** 商户 logo*/
    private String logoUrl;

    private String businessLicenseUrl;
    /** =商户联系电话*/
    private String phone;
    /**商户地址*/
    private String address;
    /**
     * 验证请求的有效性
     * */
    public ErrorCode validate(MerchantsRepository merchantsRepository){
        if(merchantsRepository.findByName(this.name) != null){
            return ErrorCode.DUPLICATE_NAME;
        }
        if(null == this.logoUrl){
            return ErrorCode.EMPTY_LOGO;
        }
        if(null == this.businessLicenseUrl){
            return ErrorCode.EMPTY_BUSINESS_LICENSE;
        }
        if(null == address){
            return ErrorCode.EMPTY_ADDRESS;
        }
        if(null == phone){
            return ErrorCode.EMPTY_PHONE;
        }
        return ErrorCode.SUCCESS;
    }

    /**
     * 将请求对象转换为商户对象
     */
    public Merchants toMerchants(){
        Merchants merchants = new Merchants();
        merchants.setAddress(address);
        merchants.setBusinessLicenseUrl(businessLicenseUrl);
        merchants.setPhone(phone);
        merchants.setName(name);
        merchants.setUrlLogo(logoUrl);
        return merchants;
    }




}
