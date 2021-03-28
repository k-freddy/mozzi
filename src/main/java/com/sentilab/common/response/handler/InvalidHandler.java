package com.sentilab.common.response.handler;


import com.sentilab.common.response.AbstractResponse;
import com.sentilab.common.response.HttpStatusCode;

import java.util.Map;

public class InvalidHandler<T> extends AbstractResponse<T> {

    public InvalidHandler() {
        super(HttpStatusCode.INVALID_PARAMETER);
    }

    public InvalidHandler(T result) {
        super(HttpStatusCode.INVALID_PARAMETER, result);
    }

    public InvalidHandler(Map<String, String> errorField) {
        super(HttpStatusCode.INVALID_PARAMETER, errorField);
    }

}
