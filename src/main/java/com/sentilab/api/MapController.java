package com.sentilab.api;

import com.sentilab.common.response.ResponseResult;
import com.sentilab.common.response.handler.ResultHandler;
import com.sentilab.dto.UserDto;
import com.sentilab.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
@AllArgsConstructor
public class MapController {

    private final ResultHandler resultHandler;

    @Autowired
    UserServiceImpl userService;

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

/*    @PostMapping(value = "user")
    public String joinUser() {

    }*/

    @GetMapping(value = "user/{id}")
    public ResponseResult<UserDto> getUserInfo(@PathVariable String id) {
        return resultHandler.success(userService.getUserInfo(id));
    }

}
