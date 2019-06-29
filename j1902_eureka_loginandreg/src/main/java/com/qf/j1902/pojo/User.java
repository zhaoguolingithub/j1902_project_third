package com.qf.j1902.pojo;

import lombok.Data;

/**
 * Created by asus on 2019/6/28.
 */
@Data
public class User {
    private int userid;
    private String username;//用户名
    private String upassword;
    private String userimage;//头像
    private String realname;//姓名
    private String gender;//性别
    private String telphone;//手机号码
    private String weichart;//微信
    private String tenqq;//QQ
    private String useremail;//邮箱
    private String address;//地址
    private String userinfo;//个人简介
    private String regtime;//注册时间
}
