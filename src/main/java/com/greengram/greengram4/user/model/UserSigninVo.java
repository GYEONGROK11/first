package com.greengram.greengram4.user.model;

import lombok.Data;

@Data
public class UserSigninVo {
    private int result;
    private int iuser;
    private String nm;
    private String pic;
    private String firebaseToken;
    private String accessToken;


}