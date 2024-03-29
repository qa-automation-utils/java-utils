package com.qa.automation.utils.java.utils.exception;

public class GenericRuntimeException extends RuntimeException {
    public GenericRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericRuntimeException(String message) {
        super(message, null);
    }

    public GenericRuntimeException(Exception exception) {
        super(exception.getMessage(), null);
    }
}
