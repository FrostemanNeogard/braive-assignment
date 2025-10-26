package com.frostemanneogard.braive.advice;

import com.frostemanneogard.braive.advice.responses.ApiResponse;
import com.frostemanneogard.braive.advice.responses.ApiResponseEntity;
import com.frostemanneogard.braive.patients.exceptions.PatientNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PatientNotFoundException.class)
    public ResponseEntity<ApiResponse<String>> handlePatientNotFoundException(
            PatientNotFoundException e) {
        return ApiResponseEntity.error(HttpStatus.NOT_FOUND, e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<String>> handleException(Exception e) {
        return ApiResponseEntity.error(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "An unknown error occurred. Please try again later"
        );
    }

}
