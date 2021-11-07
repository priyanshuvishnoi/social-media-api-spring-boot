package com.priyanshu.socialmediaapi.models;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
    private HttpStatus httpStatus;
    private String message;

    public ErrorMessage() {
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorMessage(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
