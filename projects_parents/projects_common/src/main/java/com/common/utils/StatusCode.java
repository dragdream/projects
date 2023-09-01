package com.common.utils;

/**
 * 返回码
 */
public class StatusCode {
    public static final int OK = 00000;//成功
    public static final int ERROR = 99999;//失败
    public static final int LOGINERROR = 50001;//用户名或密码错误
    public static final int ACCESSERROR = 50002;//权限不足
    public static final int REMOTEERROR = 50003;//远程调用失败
    public static final int REPERROR = 50004;//重复操作
    public static final int NOTFOUNDERROR = 50005;//没有对应的抢购数据
}
