package com.sentilab.common.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum HttpStatusCode {

    SUCCESS(200, "SUCCESS"),

    NO_DATA(204, "NO_DATA"),

    ACCESS_DENIED(401, "ACCESS_DENIED"),

    INVALID_PARAMETER(400, "INVALID_PARAMETER"),

    NO_TABLE(405, "NO_TABLE"),

    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR");

    private int status;

    private String message;
    
}
