package com.sentilab.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class AbstractResponse<T> implements ResponseResult<T> {

    private LocalDateTime timestamp;

    private int status;

    private String message;

    private T result;

    private Map<String, String> errorField;

    protected AbstractResponse(HttpStatusCode httpStatusCode) {
        this.timestamp = LocalDateTime.now();
        this.status = httpStatusCode.getStatus();
        this.message = httpStatusCode.getMessage();
        this.result = null;
    }

    protected AbstractResponse(HttpStatusCode httpStatusCode, T result) {
        this.timestamp = LocalDateTime.now();
        this.status = httpStatusCode.getStatus();
        this.message = httpStatusCode.getMessage();
        this.result = result;
    }

    protected AbstractResponse(HttpStatusCode httpStatusCode, T result, String message) {
        this.timestamp = LocalDateTime.now();
        this.status = httpStatusCode.getStatus();
        this.message = message;
        this.result = result;
    }

    protected AbstractResponse(HttpStatusCode httpStatusCode, Map<String, String> errorField) {
        this.timestamp = LocalDateTime.now();
        this.status = httpStatusCode.getStatus();
        this.message = httpStatusCode.getMessage();
        this.errorField = errorField;
    }

}
