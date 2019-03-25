package com.hjx.passbook.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: hjx
 * @Date: 2019/3/20 22:54
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private Integer errorCode = 0;
    private String errorMsg = "";
    private Object data;

    public Response(Object data){
        this.data =data;
    }

}
