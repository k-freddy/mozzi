package com.sentilab.common.response.handler;

import com.sentilab.common.response.AbstractResponse;
import com.sentilab.common.response.HttpStatusCode;

public class ServerErrorHandler<T> extends AbstractResponse<T> {

    ServerErrorHandler() {
        super(HttpStatusCode.INTERNAL_SERVER_ERROR);
    }

}
