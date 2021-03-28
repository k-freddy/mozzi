package com.sentilab.api;

import com.sentilab.common.response.ResponseResult;
import com.sentilab.common.response.handler.ResultHandler;
import com.sentilab.dto.UserDto;
import com.sentilab.service.impl.UserServiceImpl;
import com.sentilab.vo.UserJoinInfoVo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@RequestMapping(value = "/api")
@RestController
@AllArgsConstructor
public class MapController {

    private final ResultHandler resultHandler;

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "map", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String mainData() {
        return "{\"result\":\"map\"}";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest() {
        return "{\"result\":\"test\"}";
    }

    @PostMapping(value = "user")
    public ResponseResult<String> joinUser(@ModelAttribute UserJoinInfoVo vo) throws InvalidKeySpecException, NoSuchAlgorithmException {
            if (userService.joinUser(vo)) {
                return resultHandler.success("success");
            } else {
                return resultHandler.success("duplicateId");
            }
    }

    @ResponseBody
    @GetMapping(value = "user/{id}")
    public ResponseResult<UserDto> getUserInfo(@PathVariable String id) {
        try {
            return resultHandler.success(userService.getUserInfo(id));
        } catch (NullPointerException e) {
            return resultHandler.success();
        }
    }

}
