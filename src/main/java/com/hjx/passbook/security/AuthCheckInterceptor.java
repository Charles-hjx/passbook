package com.hjx.passbook.security;

import com.hjx.passbook.constant.Contants;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;

/**
 *
 * 权限拦截器
 *
 * @Author: hjx
 * @Date: 2019/3/19 20:00
 * @Version 1.0
 */
public class AuthCheckInterceptor implements HandlerInterceptor {

    /**
     * http请求 处理之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(Contants.TOKEN_STRING);
        if(StringUtils.isEmpty(token)){
            throw new Exception("Header 中缺少"+ Contants.TOKEN_STRING + "!");
        }
        if(token.equals(Contants.TOKEN)){
            throw new Exception("header中"+Contants.TOKEN_STRING + "错误");
        }

        AccessContext.setToken(token);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * http 请求完成之后调用
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        AccessContext.clearAccessKey();
    }
}
