package com.bar.manager.exception;

import com.bar.manager.controller.HttpErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionsHandler {
    @ExceptionHandler({DrinkNotFound.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    private HttpErrorResponse handleGenericException(DrinkNotFound exception) {
        return new HttpErrorResponse(
                404,
                exception.getMessage(),
                LocalDateTime.now()
        );
    }

    @ExceptionHandler({ClientNotFound.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    private HttpErrorResponse handleGenericException(ClientNotFound exception) {
        return new HttpErrorResponse(
                404,
                exception.getMessage(),
                LocalDateTime.now()
        );
    }
}
