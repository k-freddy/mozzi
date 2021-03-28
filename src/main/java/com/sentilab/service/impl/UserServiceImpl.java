package com.sentilab.service.impl;

import com.sentilab.dto.UserDto;
import com.sentilab.entity.UserEntity;
import com.sentilab.repository.UserRepository;
import com.sentilab.service.UserService;
import com.sentilab.util.PBKDF2Encryption;
import com.sentilab.vo.UserJoinInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto getUserInfo(String id) {
        UserEntity userEntity = userRepository.findAllById(id);
        UserDto userDto = UserDto.builder()
                .userId(userEntity.getId())
                .phoneNum(userEntity.getPhoneNum())
                .userPw(userEntity.getPw())
                .name(userEntity.getName())
                .email(userEntity.getEmail()).build();
        return userDto;
    }

    @Override
    public boolean joinUser(UserJoinInfoVo joinInfoVo) throws InvalidKeySpecException, NoSuchAlgorithmException {

        if (countUser(joinInfoVo.getUserId()) > 0) {
            return false;
        }

        String encryptionPassword = PBKDF2Encryption.createHash(joinInfoVo.getUserPw());
        UserDto userDto = UserDto.builder()
                .userId(joinInfoVo.getUserId())
                .userPw(encryptionPassword)
                .phoneNum(joinInfoVo.getPhoneNum())
                .name(joinInfoVo.getName())
                .email(joinInfoVo.getEmail()).build();

        userRepository.save(new UserEntity(userDto));
        return true;
    }

    @Override
    public int countUser(String id) {
        return userRepository.countById(id);
    }

}
