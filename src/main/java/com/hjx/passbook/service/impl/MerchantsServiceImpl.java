package com.hjx.passbook.service.impl;

import com.hjx.passbook.VO.CreateMerchantsRequest;
import com.hjx.passbook.VO.CreateMerchantsResponse;
import com.hjx.passbook.VO.PassTemplate;
import com.hjx.passbook.VO.Response;
import com.hjx.passbook.constant.ErrorCode;
import com.hjx.passbook.repository.MerchantsRepository;
import com.hjx.passbook.service.MerchantsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: hjx
 * @Date: 2019/3/26 20:26
 * @Version 1.0
 */
@Service
@Slf4j
public class MerchantsServiceImpl implements MerchantsService {

    @Autowired
    private MerchantsRepository merchantsRepository;

    @Override
    @Transactional
    public Response createMerchants(CreateMerchantsRequest request) {
        Response response = new Response();
        CreateMerchantsResponse merchantsResponse = new CreateMerchantsResponse();
        ErrorCode errorCode = request.validate(merchantsRepository);
        if(errorCode!=ErrorCode.SUCCESS){
            merchantsResponse.setId(-1);
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        }else{
            merchantsResponse.setId(merchantsRepository.save(request.toMerchants()).getId());
        }
        response.setData(merchantsResponse);
        return response;
    }

    @Override
    public Response buildMerchantsInfoById(Integer id) {
        return null;
    }

    @Override
    public Response dropPassTemplate(PassTemplate passTemplate) {
        return null;
    }
}
