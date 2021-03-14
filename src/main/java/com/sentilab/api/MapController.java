package com.sentilab.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

    @RequestMapping(value = "/api/map", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String mainData() {
        return "{\"result\":\"map\"}";
    }

    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest() {
        return "{\"result\":\"test\"}";
    }
}
