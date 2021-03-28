package com.sentilab.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserDto {

    private String userId;

    private String userPw;

    private String email;

    private String name;

    private String phoneNum;

}
