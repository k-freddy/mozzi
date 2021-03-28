package com.sentilab.common.response;

import java.util.Map;

public interface ResponseResult<T> {

    int getStatus();

    String getMessage();

    T getResult();

    Map<String, String> getErrorField();

}


