package com.hjx.passbook.security;

/**
 *用ThreadLocal去单独存储每一个线程的Token 信息
 *
 * @Author: hjx
 * @Date: 2019/3/18 21:17
 * @Version 1.0
 */
public class AccessContext {

    private static final ThreadLocal<String> token = new ThreadLocal<String>();

    public static String getToken(){
        return token.get();
    }

    public static void setToken(String tokenStr){
        token.set(tokenStr);
    }

    public static void clearAccessKey(){
        token.remove();
    }

}
