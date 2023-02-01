package com.dynatrace.orders.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
public class AlreadyPaidException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AlreadyPaidException(String message) {
        super(message);
    }
}
