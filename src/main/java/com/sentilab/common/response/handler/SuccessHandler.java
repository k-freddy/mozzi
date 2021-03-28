package com.sentilab.common.response.handler;

import com.sentilab.common.response.AbstractResponse;
import com.sentilab.common.response.HttpStatusCode;

public class SuccessHandler<T> extends AbstractResponse<T> {

    public SuccessHandler() {
        super(HttpStatusCode.NO_DATA);
    }

    public SuccessHandler (T result) {
        super(HttpStatusCode.SUCCESS, result);
    }

    public SuccessHandler(T result, String message) {
        super(HttpStatusCode.SUCCESS, result, message);
    }

    public SuccessHandler(T result, HttpStatusCode httpStatusCode) {
        super(httpStatusCode, result);
    }

}
