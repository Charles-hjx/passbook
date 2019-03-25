package com.hjx.passbook.repository;

import com.hjx.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: hjx
 * @Date: 2019/3/19 20:55
 * @Version 1.0
 */
public interface MerchantsRepository extends JpaRepository<Merchants,Integer> {

    /**
     * 根据商户名称获取商户对象
     * @param name
     * @return
     */
    Merchants findByName(String name);
}
