package com.sda.java_final.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

    public static ResponseEntity<ApiResponse> onSuccess(String message, Object data) {
        return ResponseEntity.status(200).body(new ApiResponse.Builder()
                .status(HttpStatus.OK.value())
                .message(message)
                .data(data)
                .build());
    }

    public static ResponseEntity<ApiResponse> onError(int status, String message) {
        return ResponseEntity.status(status).body(new ApiResponse.Builder()
                .status(HttpStatus.OK.value())
                .message(message)
                .build());
    }
}
