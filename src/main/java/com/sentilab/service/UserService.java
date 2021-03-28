package com.sentilab.service;

import com.sentilab.dto.UserDto;
import com.sentilab.vo.UserJoinInfoVo;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public interface UserService {

    UserDto getUserInfo(String id);

    void joinUser(UserJoinInfoVo joinInfoVo) throws InvalidKeySpecException, NoSuchAlgorithmException;

}
