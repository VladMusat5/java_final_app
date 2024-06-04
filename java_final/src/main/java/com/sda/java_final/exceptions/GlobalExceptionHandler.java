package com.sda.java_final.exceptions;

import com.sda.java_final.utils.ApiResponse;
import com.sda.java_final.utils.ResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException) {
        return ResponseHandler.onError(HttpStatus.NOT_FOUND.value(), resourceNotFoundException.getMessage());
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ApiResponse> handleBadRequestException(BadRequestException badRequestException) {
        return ResponseHandler.onError(HttpStatus.BAD_REQUEST.value(), badRequestException.getMessage());
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<ApiResponse> handleInternalServerError(InternalServerErrorException internalServerErrorException) {
        return ResponseHandler.onError(HttpStatus.INTERNAL_SERVER_ERROR.value(), internalServerErrorException.getMessage());
    }
}
