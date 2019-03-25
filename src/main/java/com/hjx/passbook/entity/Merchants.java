package com.hjx.passbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @Author: hjx
 * @Date: 2019/3/19 20:44
 * @Version 1.0
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Merchants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message="不能为空")
    @Basic  //默认 entity下的 所有的 字段都是 basic
    private String name;

    @NotNull(message="不能为空")
    private String urlLogo;

    @NotNull(message="不能为空")
    private String businessLicenseUrl;

    @NotNull(message="不能为空")
    private String phone;

    @NotNull(message="不能为空")
    private String address;

    /**
     * 默认不是审核者
     */
    @NotNull(message="不能为空")
    private Boolean Audited = false;
}
