package com.sentilab.common.response.handler;

import com.sentilab.common.response.HttpStatusCode;
import com.sentilab.common.response.ResponseResult;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ResultHandler {

    public <T> ResponseResult<T> success() {
        return new SuccessHandler<>();
    }

    public <T> ResponseResult<T> success(T result) {
        return new SuccessHandler<>(result);
    }

    public <T> ResponseResult<T> success(T result, String message) {
        return new SuccessHandler<>(result, message);
    }

    public <T> ResponseResult<T> success(T result, HttpStatusCode httpStatusCode) {
        return new SuccessHandler<>(result, httpStatusCode);
    }

    public <T> ResponseResult<T> invalidParam() {
        return new InvalidHandler<>();
    }

    public <T> ResponseResult<T> invalidParam(T result) {
        return new InvalidHandler<>(result);
    }

    public <T> ResponseResult<T> invalidParam(List<FieldError> fieldErrors) {
        Map<String, String> errorMap = new HashMap<>();
        fieldErrors.forEach(field ->
                errorMap.put(field.getField(), field.getDefaultMessage()));
        return new InvalidHandler<>(errorMap);
    }

    public <T> ResponseResult<T> invalidParam(BindingResult ...bindingResults) {
        Map<String, String> errorMap = new HashMap<>();
        for (BindingResult bindingResult: bindingResults) {
            if (bindingResult.hasErrors()) {
                bindingResult.getFieldErrors().forEach(field -> {
                    errorMap.put(field.getField(), field.getDefaultMessage());
                });
            }
        }
        return new InvalidHandler<>(errorMap);
    }

    public <T> ResponseResult<T> serverError() {
        return new ServerErrorHandler<>();
    }

    public <T> ResponseResult<T> serverError(Exception e) {
        e.printStackTrace();
        return new ServerErrorHandler<>();
    }

}
